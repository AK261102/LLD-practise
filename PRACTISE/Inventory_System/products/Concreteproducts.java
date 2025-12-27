package PRACTISE.Inventory_System.products;

import PRACTISE.Inventory_System.core.Productcategory;

public class Concreteproducts extends Product {
    private String brand;
    private int warrantyMonths;

    public ElectronicsProduct(string sku, String name, double price,int quantity,int threshold)
    {
        super(sku,name,price,quantity,threshold,Productcategory.ELECTRONICS);
        this.warrantyMonths=12;
    }
}

public class ClothingProduct extends Product {
    private String size;
    private String color;

    public ClothingProduct(String sku, String name, double price, int quantity, int threshold)
    {
        super(sku, name, price, quantity, threshold, Productcategory.CLOTHING));
    }
}
