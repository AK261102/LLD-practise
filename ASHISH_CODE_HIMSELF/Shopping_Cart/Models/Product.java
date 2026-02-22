package ASHISH_CODE_HIMSELF.Shopping_Cart.Models;

public class Product {
     private final String id;
    private final String name;
    private double price;
    private int stock;

     public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvaliable(int qty)
    {
        return stock>=qty;
    }
    public void updateStock(int qty)
    {
        if(!isAvaliable(qty))
        {
            //  runtime exception;
        }
        stock-=qty;
    }
      public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    
}
