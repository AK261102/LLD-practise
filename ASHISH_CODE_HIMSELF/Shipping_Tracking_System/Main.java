package ASHISH_CODE_HIMSELF.Shipping_Tracking_System;

import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.Enum.ShippingStatus;
import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.ShippmentNotification.AnalyticsNotification;
import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.ShippmentNotification.CustomerNotification;

public class Main {
    public static void main(String[] args) {
        ShipmentService service=new ShipmentService();
        service.addObserver(new CustomerNotification());
        service.addObserver(new AnalyticsNotification());
           Shipment s1 = service.createShipment(
            "Ashish", "Mumbai", "Bangalore", 2.5,
            new StandardFee(), 980);

            service.updateStatus(s1.getId, ShippingStatus.CREATED, ShippingStatus.INTRANSIT);
        service.track(s1.getId());
    }
}
