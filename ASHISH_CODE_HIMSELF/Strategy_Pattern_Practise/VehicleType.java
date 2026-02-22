package ASHISH_CODE_HIMSELF.Strategy_Pattern_Practise;

public enum VehicleType {
    BIKE("Bike",2.0),
    CAR("Car",4.0),
    TRUCK("Truck",6.0);

    private String type;
    private double price;
    public VehicleType(String type,double price)
    {
        this.type=type;
        this.price=price;
    }
    public String getVehicleType(String type)
    {
        return type;
    }
    public double getVehicePrice()
    {
        return price;
    }
}
