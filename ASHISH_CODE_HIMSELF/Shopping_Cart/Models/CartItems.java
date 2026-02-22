package ASHISH_CODE_HIMSELF.Shopping_Cart.Models;

public class CartItems {
    private Product product;
    private int quantity;
    public CartItems(Product product,int quantity)
    {
        this.product=product;
        this.quantity=quantity;
    }
    public int getSubTotal()
    {
        return product.getPrice()*quantity;
    }
    public void addQuantity(int qty)
    {
        this.quantity+=qty;
    }
    public void setQuantity(int qty)
    {
        this.quantity=qty;
    }
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
}
