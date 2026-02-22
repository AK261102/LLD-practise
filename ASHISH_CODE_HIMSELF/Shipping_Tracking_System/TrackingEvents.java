package ASHISH_CODE_HIMSELF.Shipping_Tracking_System;

import java.time.LocalDateTime;

import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.Enum.ShippingStatus;

public class TrackingEvents {
    private ShippingStatus status;
    private LocalDateTime timestamp;
    private String location;
      public TrackingEvent(ShipmentStatus status, String location) {
        this.status = status;
        this.location = location;
        this.timestamp = LocalDateTime.now();
    }
    public void getStatus()
    {
        return status;
    }
}
