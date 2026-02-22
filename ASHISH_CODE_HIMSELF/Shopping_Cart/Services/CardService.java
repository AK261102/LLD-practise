package ASHISH_CODE_HIMSELF.Shopping_Cart.Services;

import java.util.ArrayList;
import java.util.List;

import ASHISH_CODE_HIMSELF.Shopping_Cart.Models.CartItems;
import ASHISH_CODE_HIMSELF.Shopping_Cart.Models.Order;
import ASHISH_CODE_HIMSELF.Shopping_Cart.Notification.OrderObserver;
import ASHISH_CODE_HIMSELF.Shopping_Cart.PricingStrategy.PricingStrategy;
import ASHISH_CODE_HIMSELF.Shopping_Cart.PricingStrategy.RegularPricingStrategy;

public class CardService {
    private Cart cart = new Cart();
    private PricingStrategy strategy = new RegularPricingStrategy();
    private List<OrderObserver> observer = new ArrayList<>();
    private int counter=0;

    public void SetStrategy(PricingStrategy e)
    {
        this.strategy=e;
    }

    public void addObserver(OrderObserver obs)
    {
        observer.add(obs);
    }
    public void addItems(double price,int qty)
    {
        cart.addItems(price, qty);
    }
    public void removeItems(String productId)
    {
        cart.removeItems(productId);
    } public void updateQty(String productId, int newQty) {
        cart.updateQuantity(productId, newQty);
        System.out.println("  ✏️ Quantity → " + newQty);
    }

    public void checkout()
    {
        if(cart.isEmpty())
        {
            //runtime exception
        }

        double total = PricingStrategy.calculatePrice(cart.getItems());

        for(CartItems it:cart.getItems())
        {
            it.getProduct().updateStock(it.getQuantity());
        }
        counter++;
        String orderId = "ORD-" + String.format("%04d", counter);
        Order order = new Order(orderId, cart.getItems(), total, PricingStrategy);

        cart.clear();

        for(OrderObserver obs: observer)
        {
            obs.onPlacedOrder(order);
        }
    }
}
