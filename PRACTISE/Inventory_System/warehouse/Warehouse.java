package PRACTISE.Inventory_System.warehouse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import PRACTISE.Inventory_System.products.Product;

/**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 6: WAREHOUSE CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Warehouse stores and manages products
 * 
 * KEY OPERATIONS:
 *   - Add product (new or increase quantity)
 *   - Remove product (decrease quantity)
 *   - Get product by SKU
 *   - List all products
 * 
 * 
 * DATA STRUCTURE:
 * ───────────────
 * Map<String, Product>  →  SKU → Product
 * 
 * WHY Map?
 *   - O(1) lookup by SKU
 *   - SKU is unique identifier
 *   - Easy to check if product exists
 * 
 * 
 * WAREHOUSE VISUALIZATION:
 * ────────────────────────
 *   ┌────────────────────────────────────────┐
 *   │         WAREHOUSE: Mumbai             │
 *   │                                        │
 *   │  SKU: ELEC-LAP-001  │  SKU: CLTH-TSH-001
 *   │  📱 MacBook Pro     │  👕 T-Shirt
 *   │  Qty: 50            │  Qty: 200
 *   │                     │
 *   │  SKU: GROC-APL-001  │  SKU: FURN-CHR-001
 *   │  🍎 Apple           │  🪑 Office Chair
 *   │  Qty: 100           │  Qty: 30
 *   └────────────────────────────────────────┘
 */

public class Warehouse {
    
    private int id;
    private String name;
    private String location;
    private Map<String, Product> products;

    public Warehouse(int id, String name, String location)
    {
        this.id=id;
        this.name=name;
        this.location=location;
        this.product=new HashMap<>();
    }

    public void addProduct(Product product,int quantity)
    {
        String sku= product.getSku();
        if(products.containskey(sku))
        {
            Product existing = product.get(sku);
            existing.addStock(quantity);
        }
        else
        {
            product.getQuantity(   quantity);
            products.put(sku, product);
        }
    }

    public void removeProduct(Product product,int quantity)
    {
        Product product = product.get(sku);
        int currentQty = product.getQuantity();

        product.removeStock(quantity);
    }
      // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Get product by SKU
     */
    public Product getProductBySku(String sku) {
        return products.get(sku);
    }
    
    /**
     * Get available quantity of a product
     */
    public int getAvailableQuantity(String sku) {
        Product product = products.get(sku);
        return product != null ? product.getQuantity() : 0;
    }
    
    /**
     * Get all products in warehouse
     */
    public Collection<Product> getAllProducts() {
        return products.values();
    }
    
    /**
     * Get products with low stock
     */
    public List<Product> getLowStockProducts() {
        List<Product> lowStock = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.isLowStock()) {
                lowStock.add(product);
            }
        }
        return lowStock;
    }
    
    /**
     * Check if product exists in warehouse
     */
    public boolean hasProduct(String sku) {
        return products.containsKey(sku);
    }
    
    // ─────────────────────────────────────────────────────────────
    // INFO GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getProductCount() { return products.size(); }
    
    // ─────────────────────────────────────────────────────────────
    // DISPLAY
    // ─────────────────────────────────────────────────────────────
    
    public void displayInventory() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║  📦 WAREHOUSE: " + name);
        System.out.println("║  📍 Location: " + location);
        System.out.println("║  📊 Products: " + products.size());
        System.out.println("╠══════════════════════════════════════════════╣");
        
        if (products.isEmpty()) {
            System.out.println("║  No products in inventory");
        } else {
            for (Product product : products.values()) {
                String status = product.isLowStock() ? "⚠️ LOW" : "✅ OK";
                System.out.println("║  " + status + " " + product);
            }
        }
        System.out.println("╚══════════════════════════════════════════════╝\n");
    }
}
