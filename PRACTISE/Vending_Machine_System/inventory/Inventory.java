package PRACTISE.Vending_Machine_System.inventory;

public class Inventory {
    
    private Itemshelf[] shelves;

    public Inventory(int shelfCount)
    {
        shelves = new Itemshelf[shelfCount];
        intializsrShelves();
    }

    private void intializsrShelves()
    {
        int startCode=101;
        for(int i=0;i<shelves.length;i++)
        {
            shelves[i] = new Itemshelf(startCode+i);
        }
        
    }
     // ─────────────────────────────────────────────────────────────
    // ADD ITEM
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Add item to shelf with given code
     */
    public void addItem(Item item, int code) throws Exception {
        ItemShelf shelf = getShelfByCode(code);
        if (shelf != null) {
            shelf.addItem(item);
            System.out.println("✅ Added " + item.getType() + " to shelf " + code);
        } else {
            throw new Exception("Invalid shelf code: " + code);
        }
    }
    
    // ─────────────────────────────────────────────────────────────
    // GET ITEM
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Get item from shelf (without removing)
     */
    public Item getItem(int code) throws Exception {
        ItemShelf shelf = getShelfByCode(code);
        
        if (shelf == null) {
            throw new Exception("Invalid code: " + code);
        }
        
        if (shelf.isSoldOut()) {
            throw new Exception("Item sold out at shelf " + code);
        }
        
        return shelf.peekItem();
    }
    
    // ─────────────────────────────────────────────────────────────
    // REMOVE ITEM
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Remove and return item from shelf
     */
    public Item removeItem(int code) throws Exception {
        ItemShelf shelf = getShelfByCode(code);
        
        if (shelf == null) {
            throw new Exception("Invalid code: " + code);
        }
        
        if (shelf.isSoldOut()) {
            throw new Exception("Item sold out at shelf " + code);
        }
        
        return shelf.removeItem();
    }
    
    // ─────────────────────────────────────────────────────────────
    // HELPER METHODS
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Get shelf by code
     */
    private ItemShelf getShelfByCode(int code) {
        for (ItemShelf shelf : shelves) {
            if (shelf.getCode() == code) {
                return shelf;
            }
        }
        return null;
    }
    
}
