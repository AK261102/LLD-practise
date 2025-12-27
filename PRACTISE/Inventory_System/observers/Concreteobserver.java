package PRACTISE.Inventory_System.observers;

import java.util.List;

import PRACTISE.Inventory_System.products.Product;

public class SupplierNotification implements Inventoryobserver{

    private String supplierName;
    private String contactEmail;
    public SupplierNotification(String supplierName, String contractEmail)
    {
        this.supplierName=supplierName;
        this.contactEmail=contractEmail;
    }

    @Override
    public void update(Product product)
    {
        System.out.println("Calliing ");
    }
}

public class DashboardAlert implements Inventoryobserver {
    private List<String> adminUser;

    public DashboardAlert(List<String> adminUser)
    {
        this.adminUser=adminUser;
    }

    @Override
    public void update(Product product)
    {
        int quantity=product.getQuantity();
        int threshold = product.getThreshold();
        double percentcent= quantity/threshold*100;

    }
}
// ═══════════════════════════════════════════════════════════════════
// EMAIL ALERT
// ═══════════════════════════════════════════════════════════════════

/**
 * Sends email alerts to configured recipients
 */
class EmailAlertObserver implements InventoryObserver {
    
    private String[] recipients;
    
    public EmailAlertObserver(String... recipients) {
        this.recipients = recipients;
    }
    
    @Override
    public void update(Product product) {
        if (product.isLowStock()) {
            System.out.println("\n📮 [EMAIL ALERT]");
            for (String recipient : recipients) {
                System.out.println("   Sending low stock alert to: " + recipient);
            }
            System.out.println("   Product: " + product.getName() + 
                               " needs restock!\n");
        }
    }
}

// ═══════════════════════════════════════════════════════════════════
// AUDIT LOG OBSERVER
// ═══════════════════════════════════════════════════════════════════

/**
 * Logs all inventory alerts for audit trail
 */
class AuditLogObserver implements InventoryObserver {
    
    @Override
    public void update(Product product) {
        String timestamp = java.time.LocalDateTime.now().toString();
        System.out.println("\n📝 [AUDIT LOG] " + timestamp);
        System.out.println("   Event: LOW_STOCK_ALERT");
        System.out.println("   SKU: " + product.getSku());
        System.out.println("   Product: " + product.getName());
        System.out.println("   Quantity: " + product.getQuantity());
        System.out.println("   Threshold: " + product.getThreshold());
        System.out.println();
    }
}

