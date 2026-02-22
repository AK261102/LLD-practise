package ASHISH_CODE_HIMSELF.Observer_Pattern_Practise;

import java.time.LocalDateTime;

public class ShippingEvents {
    private String shippingID;
    private DeliveryStatus newStatus;
    private DeliveryStatus oldStatus;
    private String location;
    private LocalDateTime time;
    
    public ShippingEvents(String shippingID,DeliveryStatus newStatus, DeliveryStatus oldStatus, String location)
    {
        this.shippingID=shippingID;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.location = location;
        this.timestamp = LocalDateTime.now();
          public String getShipmentId() { return shipmentId; }
    public ShipmentStatus getOldStatus() { return oldStatus; }
    public ShipmentStatus getNewStatus() { return newStatus; }
    public String getLocation() { return location; }
    public LocalDateTime getTimestamp() { return timestamp; }
    }
}
