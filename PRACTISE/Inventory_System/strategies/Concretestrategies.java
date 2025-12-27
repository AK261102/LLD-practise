package PRACTISE.Inventory_System.strategies;

import PRACTISE.Inventory_System.products.Product;

public class JustInTimeStrategy implements Replenishmentstrategy {

    @Override
    public void replenish(Product product)
    {
        int currentQty=product.getQuantity();
        int threshold=product.getThreshold();

        int orderQuantity = threshold - currentQty;
    }
}

public class BuldInOrderStrategy implements Replenishmentstrategy {

    @Override
    public void replenish(Product product)
    {
       int currentQty = product.getQuantity();
       int threshold = product.getThreshold();

       int orderQuantity= threshold-currentQty;
    }
}
