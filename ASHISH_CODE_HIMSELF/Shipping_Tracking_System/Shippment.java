package ASHISH_CODE_HIMSELF.Shipping_Tracking_System;

import java.util.ArrayList;
import java.util.List;

import ASHISH_CODE_HIMSELF.Observer_Pattern_Practise.ShippingObserver;
import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.Enum.ShippingStatus;
import ASHISH_CODE_HIMSELF.Shipping_Tracking_System.ShippmentNotification.ShippmentObserver;

public class Shippment {
    private final String id;
    private final String customerName;
    private final String origin;
    private final String destination;
    private final double weightKg;

    private ShippingStatus status;
    private List<TrackingEvent> history;
    private List<ShippmentObserver> observer;
    private double fee;

    public Shippment(String id, String customerName, String origin, String destincation, double weightKg)
    {
          this.id = id;
        this.customerName = customerName;
        this.origin = origin;
        this.destination = destination;
        this.weightKg = weightKg;
        this.status=status.CREATED;
        this.history=new ArrayList<>();
        this.observer=new ArrayList<>();

        history.add(new TrackingEvents(status.CREATED,origin));

        public void updateStatus(ShippingStatus newStatus, String location)
        {
            if(!status.canTransmitTo(newStatus))
            {
                //illegal exception
            }
            this.status=newStatus;
            TrackingEvents events = new TrackingEvents(newStatus,location);
            history.add(events);
            for(ShippingObserver obs:observer){
                obs.onStatusChange(events);
            }
        }

         // --- Observer management ---
    public void addObserver(ShipmentObserver obs) { observers.add(obs); }

    // --- Fee ---
    public void setFee(double fee) { this.fee = fee; }
    public double getFee() { return fee; }

    // --- Tracking ---
    public void printTracking() {
        System.out.println("\n📦 " + id + " | " + customerName +
            " | " + origin + " → " + destination);
        for (TrackingEvent e : history) {
            System.out.println("  " + (e.getStatus() == status ? "● " : "○ ") + e);
        }
    }

    // --- Getters ---
    public String getId() { return id; }
    public ShipmentStatus getStatus() { return status; }
    public double getWeightKg() { return weightKg; }
    }
}
