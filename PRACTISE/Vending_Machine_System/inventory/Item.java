package PRACTISE.Vending_Machine_System.inventory;

import PRACTISE.Parking_Alot.paymentStrategy.payment;
import PRACTISE.Vending_Machine_System.core.ItemType;

public class Item {
    private ItemType type;
    private int price;

    public Item()
    {

    }

    public Item(ItemType type, int price)
    {
        this.type=type;
        this.price=price;
    }

      // ─────────────────────────────────────────────────────────────
    // GETTERS AND SETTERS
    // ─────────────────────────────────────────────────────────────
    
    public ItemType getType() {
        return type;
    }
    
    public void setType(ItemType type) {
        this.type = type;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return type + " (₹" + price + ")";
    }
}
