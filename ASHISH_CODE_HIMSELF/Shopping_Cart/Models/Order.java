package ASHISH_CODE_HIMSELF.Shopping_Cart.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private int orderid;
    private List<CartItems> items;
    private double total;
    private String priceUsed;
    private LocalDateTime time;
        public Order(String orderId, List<CartItem> items, double total, String pricingUsed) {
        this.orderId = orderId;
        this.items = new ArrayList<>(items);  // defensive copy!
        this.total = total;
        this.pricingUsed = pricingUsed;
        this.createdAt = LocalDateTime.now();
    }
       public String getOrderId() { return orderId; }
    public double getTotal() { return total; }
    public List<CartItem> getItems() { return Collections.unmodifiableList(items); }
}
