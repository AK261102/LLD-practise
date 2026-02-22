package ASHISH_CODE_HIMSELF.Shopping_Cart.PricingStrategy;

import ASHISH_CODE_HIMSELF.Shopping_Cart.Models.CartItems;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(List<CartItems> items)
    {
        double total=0;
        for(CartItems item:items)
        {
            total+=item.getSubTotal();
        }
        return total;
    }
    @Override 
    public String getName()
    {
        return "REGULAR";
    }
}
