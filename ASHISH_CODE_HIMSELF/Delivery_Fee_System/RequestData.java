package ASHISH_CODE_HIMSELF.Delivery_Fee_System;

public class RequestData {
    private int requestId;
    private double weight;
    private VehicleZone zone;
    private boolean fragile;

     public DeliveryRequest(String requestId, double weight, DeliveryZone zone, boolean fragile) {
        this.requestId = requestId;
        this.weight = weight;
        this.zone = zone;
        this.fragile = fragile;
    }

    public String getRequestId() { return requestId; }
    public double getWeight() { return weight; }
    public DeliveryZone getZone() { return zone; }
    public boolean isFragile() { return fragile; }
}
