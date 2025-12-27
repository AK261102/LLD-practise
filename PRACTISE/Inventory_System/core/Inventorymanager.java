package PRACTISE.Inventory_System.core;

import java.util.ArrayList;
import java.util.List;

import PRACTISE.Inventory_System.strategies.Replenishmentstrategy;
import PRACTISE.Inventory_System.warehouse.Warehouse;

public class Inventorymanager {
    
    private static Inventorymanager instance;

    private List<Warehouse> warehouses;
    private Productfactory productFactory;

    private List<InventoryObserver> observers;

    private Replenishmentstrategy replenishmentstrategy;

    private Inventorymanager()
    {
        this.warehouses=new ArrayList<>();
        this.observers=new ArrayList<>();
        this.productFactory=new Productfactory();
    }

    public static Inventorymanager getInstance(){
        if(instance==null)
            instance=new Inventorymanager();
        return instance;
    }

    public void addWareHouse(warehouse ware)
    {
        warehouses.add(ware);
    }
     public void removeWarehouse(Warehouse warehouse) {
        warehouses.remove(warehouse);
        System.out.println("✅ Removed warehouse: " + warehouse.getName());
    }
    
    public List<Warehouse> getWarehouses() {
        return new ArrayList<>(warehouses);
    }

    public void addObserver(Inventorymanager observer)
    {
        addObserver(observer);
    }

    public Product getProductBySku(String sku)
    {
        for(Warehouse warehouse:warehouses)
        {
            Product product = warehouse.getProductBySku(sku);
        }
        return product;
    }
}
