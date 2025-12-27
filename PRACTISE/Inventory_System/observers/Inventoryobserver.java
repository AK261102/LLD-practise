package PRACTISE.Inventory_System.observers;


/**
 * ══════════════════════════════════════════════════════════════════
 *            STEP 5: INVENTORY OBSERVER (INTERFACE)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ OBSERVER PATTERN ⭐
 * 
 * WHY OBSERVER?
 * ─────────────
 * When stock goes below threshold, multiple actions needed:
 *   - Notify supplier
 *   - Update dashboard
 *   - Send email alert
 *   - Log to audit system
 * 
 * Without Observer:
 *   if (lowStock) {
 *       notifySupplier();
 *       updateDashboard();
 *       sendEmail();
 *       logToAudit();
 *   }
 *   // Every time you add notification, change this code!
 * 
 * With Observer:
 *   observers.forEach(o -> o.update(product));
 *   // Add/remove observers without changing this code!
 * 
 * 
 * STRUCTURE:
 * ──────────
 *   InventoryManager (Subject)
 *          │
 *          │ notifies
 *          ▼
 *   ┌─────────────────────────────┐
 *   │   InventoryObserver         │
 *   │      (Interface)            │
 *   └────────────┬────────────────┘
 *                │
 *       ┌────────┼────────┐
 *       ▼        ▼        ▼
 *  ┌─────────┐ ┌─────────┐ ┌─────────┐
 *  │Supplier │ │Dashboard│ │ Email   │
 *  │Notifier │ │ Alert   │ │ Alert   │
 *  └─────────┘ └─────────┘ └─────────┘
 */

public interface Inventoryobserver {
    
    void update(Product product);
}
