package ASHISH_CODE_HIMSELF.Delivery_Fee_System;

public class VehicleZone {
    LOCAL(1.0),CITY(2.0);
    private double multiplier;
    public VehicleZone(double multiplier)
    {
        this.multiplier=multiplier;
    }
    public double getVehicleZone()
    {
        return multiplier;
    }
}
