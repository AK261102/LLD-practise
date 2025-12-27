package PRACTISE.Inventory_System.core;

import PRACTISE.Inventory_System.products.Product;

/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 3: PRODUCT FACTORY
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ FACTORY PATTERN ⭐
 * 
 * WHY FACTORY?
 * ────────────
 * Different product categories have different classes:
 *   - ELECTRONICS → ElectronicsProduct
 *   - CLOTHING → ClothingProduct
 *   - GROCERY → GroceryProduct
 * 
 * Factory centralizes this creation logic!
 * 
 * 
 * BENEFITS:
 * ─────────
 * 1. Encapsulation: Creation logic in one place
 * 2. Extensibility: Add new product type easily
 * 3. Consistency: All products created same way
 * 
 * 
 * USAGE:
 * ──────
 *   ProductFactory factory = new ProductFactory();
 *   Product laptop = factory.createProduct(
 *       ProductCategory.ELECTRONICS,
 *       "ELEC-LAP-001",
 *       "MacBook Pro",
 *       150000.0,
 *       50,
 *       10
 *   );
 */

public class Productfactory {
    

    public Product createProduct(Productcategory category, String sku, String name, double price, int quantity, int threshold)
    {
        case ELECTRONICS:
            return new ElectronicsProduct(sku,name,price,quantity,threshold);
        case CLOTHING:
            return new ClothingProduct(sku,name, price,quantity,threshold)''    
    }
}
