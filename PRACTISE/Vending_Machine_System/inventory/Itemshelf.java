package PRACTISE.Vending_Machine_System.inventory;

import java.util.ArrayList;
import java.util.List;

/**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 3: ITEM SHELF CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Represents a single slot/shelf in the vending machine
 * 
 * Each shelf:
 *   - Has a CODE (101, 102, etc.) for selection
 *   - Holds MULTIPLE ITEMS of the same type
 *   - Tracks SOLD OUT status
 * 
 * 
 * VISUALIZATION:
 * ──────────────
 *   ┌─────────────────────┐
 *   │  SHELF CODE: 101    │
 *   │                     │
 *   │  [COKE][COKE][COKE] │  ← 3 Coke items
 *   │                     │
 *   │  Sold Out: NO       │
 *   └─────────────────────┘
 */

public class Itemshelf {

    private int code;
    private List<Item> items;
    private boolean soldout;

    public Itemshelf(int code)
    {
        this.code=code;
        this.items = new ArrayList<>();
        this.soldout = true;
    }

    public void addItem(Item item)
    {
        items.add(item);
        if(soldOut)
        {
            soldout=false;
        }
    }

     public Item removeItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item item = items.remove(0);  // Remove first item
        if (items.isEmpty()) {
            soldOut = true;  // Now sold out
        }
        return item;
    }
    
    /**
     * Get first item without removing (peek)
     */
    public Item peekItem() {
        if (items.isEmpty()) {
            return null;
        }
        return items.get(0);
    }
    
    /**
     * Check if shelf has items
     */
    public boolean hasItems() {
        return !items.isEmpty();
    }
    
    /**
     * Get count of items
     */
    public int getItemCount() {
        return items.size();
    }
    
    // ─────────────────────────────────────────────────────────────
    // GETTERS AND SETTERS
    // ─────────────────────────────────────────────────────────────
    
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public boolean isSoldOut() {
        return soldOut;
    }
    
    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
    
    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "Shelf " + code + ": EMPTY";
        }
        Item sample = items.get(0);
        return "Shelf " + code + ": " + sample.getType() + 
               " (₹" + sample.getPrice() + ") x" + items.size() +
               (soldOut ? " [SOLD OUT]" : "");
    }
}
