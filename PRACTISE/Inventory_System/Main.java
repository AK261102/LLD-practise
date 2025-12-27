package PRACTISE.Inventory_System;

import PRACTISE.Inventory_System.core.Inventorymanager;
import PRACTISE.Inventory_System.core.Productfactory;
import PRACTISE.Inventory_System.observers.Inventoryobserver;
import PRACTISE.Inventory_System.products.Product;
import PRACTISE.Inventory_System.warehouse.Warehouse;

public class Main {
    
    /***
     * 
     * getting manager
     * create warehouse
     * create product
     * add product to ware house
     * sert up obserrver
     */

    Inventorymanager manager = Inventorymanager.getInstance();
    warehouse warehouseMumabi = new Warehouse(1, "mumbai", "india");
    manager.addWareHouse(warehouseMumabi);

    Productfactory factory = manager.getProductFactory();
      // Electronics
        Product laptop = factory.createProduct(
            ProductCategory.ELECTRONICS,
            "ELEC-LAP-001",
            "MacBook Pro 14\"",
            150000.0,
            50,    // quantity
            20     // threshold (low stock if < 20)
        );
        
        Product phone = factory.createProduct(
            ProductCategory.ELECTRONICS,
            "ELEC-PHN-001",
            "iPhone 15 Pro",
            130000.0,
            100,
            30
        );
        
        // Clothing
        Product tshirt = factory.createProduct(
            ProductCategory.CLOTHING,
            "CLTH-TSH-001",
            "Cotton T-Shirt",
            999.0,
            200,
            50
        );


        warehouse.addProduct(laptop,50);
        warehouse.addProduct(tshirt,100);

        Inventoryobserver suppInventoryobserver= new SupplierNotification("abc ", "@abc");
        manager.addObserver(suppInventoryobserver);
        manager.setReplenishmentstrategym(new JustInTimeStrategy());
}
