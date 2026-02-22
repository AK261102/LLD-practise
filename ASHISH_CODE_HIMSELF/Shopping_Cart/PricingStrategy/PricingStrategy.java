package ASHISH_CODE_HIMSELF.Shopping_Cart.PricingStrategy;

import ASHISH_CODE_HIMSELF.Shopping_Cart.Models.CartItems;

public interface PricingStrategy {
    double calculatePrice(List<CartItems> items);
    String getName();
    
}
