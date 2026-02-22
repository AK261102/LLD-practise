package ASHISH_CODE_HIMSELF.Shipping_Tracking_System;

import java.util.HashMap;
import java.util.Map;

import ASHISH_CODE_HIMSELF.Observer_Pattern_Practise.ShippingObserver;
import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.Strategy.FeeStrategy;

public class ShipmentService {
    private Map<String,Shippment> shipments = new HashMap<>();
    int cnt=0;
    public Shippment createShippment(String customerName, String origin, String destinction, double distance ,double weight, FeeStrategy feestrategy)
    {
        cnt++;
        String id = "XXX"+String.format("%04", cnt);
        Shippment shippent = new Shippment(id, customerName, origin, destinction, weight);
        double fee=feestrategy.feeTotal(weight, distance);
        shippent.setFee(fee);
        ShippingObserver obs=new ShippingObserver() {
            
        };
        shippent.addObserver(obs);
        shipments.put(id,shippent);
        return Shippment;
    }

     public void updateStatus(String shipmentId, ShipmentStatus newStatus, String location) {
        Shipment shipment = shipments.get(shipmentId);
        if (shipment == null) {
            throw new IllegalArgumentException("Not found: " + shipmentId);
        }
        shipment.updateStatus(newStatus, location);
    }
     public void track(String shipmentId) {
        Shipment shipment = shipments.get(shipmentId);
        if (shipment == null) {
            throw new IllegalArgumentException("Not found: " + shipmentId);
        }
        shipment.printTracking();
    }
}
