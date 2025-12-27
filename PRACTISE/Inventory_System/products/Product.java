package PRACTISE.Inventory_System.products;

import PRACTISE.Inventory_System.core.Productcategory;

/**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 2: PRODUCT CLASSES
 * ══════════════════════════════════════════════════════════════════
 * 
 * Product is ABSTRACT because:
 *   - Different products have different attributes
 *   - Electronics: brand, warranty
 *   - Clothing: size, color
 *   - Grocery: expiryDate, refrigerated
 * 
 * 
 * CLASS HIERARCHY:
 * ────────────────
 *           Product (abstract)
 *                │
 *       ┌────────┼────────┬────────┐
 *       ▼        ▼        ▼        ▼
 *   Electronics Clothing Grocery Furniture
 * 
 * 
 * KEY ATTRIBUTES:
 * ───────────────
 * SKU (Stock Keeping Unit):
 *   - Unique identifier like "ELEC-LAP-001"
 *   - Used as key in warehouse Map
 * 
 * Threshold:
 *   - Minimum stock level
 *   - If quantity < threshold → Low stock alert!
 */

public abstract class Product {
    private String sku;
    private String name;
    private double price;
    private int quantity;
    private int threshold;
    private Productcategory category;

    public Product(String sku, String name, double price,int quantity,int threshold,Productcategory category)
    {
        this.sku=sku;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.threshold=threshold;
        this.category=category;
    }

    public void addStock(int amount){
        if(amount>0)
            this.quantity+=amount;
    }

    public boolean removeStock(int amount)
    {
        if(amount > 0 && this.quantity >= amount)
        {
            this.quantity -= amount;
            return true;
        }
        return false;
    }

    // ─────────────────────────────────────────────────────────────
    // GETTERS AND SETTERS
    // ─────────────────────────────────────────────────────────────
    
    public String getSku() { return sku; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public int getThreshold() { return threshold; }
    public ProductCategory getCategory() { return category; }
    
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setThreshold(int threshold) { this.threshold = threshold; }
    public void setPrice(double price) { this.price = price; }
}
