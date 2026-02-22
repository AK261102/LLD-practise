package ASHISH_CODE_HIMSELF.Shopping_Cart.Services;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ASHISH_CODE_HIMSELF.Shopping_Cart.Models.CartItems;
import ASHISH_CODE_HIMSELF.Shopping_Cart.Models.Product;

public class Cart {
    private Map<String,CartItems> map= new LinkedHashMap<>();
    public void addItems(Product product,int newQuantity)
    {
        if(!product.outOfStock())
        {

        }
        if(map.contains(product.getId()))
        {
            CartItems existing=map.get(product.getId());
            int newQuantity=existing.getQuantity()+newQuantity;
            existing.addQuantity(newQuantity);
        }
        else
        {
            map.put(product.getId(),new CartItems(product, newQuantity));
        }
    }

    public void removeItems(String productId)
    {
        if(!map.containsKey(productId))
        {
            // items is not there in the card;
        }
        map.remove(productId);
    }

    public void updateItems(String productId, int newQuantity)
    {
        CartItems items=map.get(productId);
        if(items==null)
        {
            // items are not in card
        }
        if(newQuantity<=0)
        {
            // new quantity is null
        }
        items.setQuantity(newQuantity);
    }
       public List<CartItem> getItems() { return new ArrayList<>(items.values()); }
    public boolean isEmpty() { return items.isEmpty(); }
    public void clear() { items.clear(); }
}
