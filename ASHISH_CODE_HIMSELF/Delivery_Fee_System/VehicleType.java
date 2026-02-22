package ASHISH_CODE_HIMSELF.Delivery_Fee_System;

public class VehicleType {
    BIKE(5,0),CAR(10.0);
    private double weight;
    public VehicleType(double weight)
    {
        this.weight=weight;
    }
    public double getWeight()
    {
        return weight;
    }
}
