package PRACTISE.Inventory_System.strategies;

/**
 * ══════════════════════════════════════════════════════════════════
 *            STEP 4: REPLENISHMENT STRATEGY (INTERFACE)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ STRATEGY PATTERN ⭐
 * 
 * WHY STRATEGY FOR REPLENISHMENT?
 * ────────────────────────────────
 * Different products may need different restocking methods:
 * 
 *   - Just-In-Time: Order exactly when needed
 *     • Good for: Expensive items, limited storage
 *     • Example: Electronics (order when stock < threshold)
 * 
 *   - Bulk Order: Order in large quantities
 *     • Good for: Cheap items, high turnover
 *     • Example: Grocery (order 1000 units at once)
 * 
 *   - Seasonal: Order based on season
 *     • Good for: Fashion, holiday items
 *     • Example: Winter jackets in autumn
 * 
 * 
 * STRUCTURE:
 * ──────────
 *       ┌────────────────────────────┐
 *       │  ReplenishmentStrategy     │
 *       │       (Interface)          │
 *       └─────────────┬──────────────┘
 *                     │
 *         ┌───────────┼───────────┐
 *         ▼           ▼           ▼
 *    ┌─────────┐ ┌─────────┐ ┌─────────┐
 *    │JustIn   │ │  Bulk   │ │Seasonal │
 *    │Time     │ │ Order   │ │ Order   │
 *    └─────────┘ └─────────┘ └─────────┘
 */


public interface Replenishmentstrategy {
    

    void replenish(Product product)

    
}
