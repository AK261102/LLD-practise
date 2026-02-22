package ASHISH_CODE_HIMSELF.Parking_Lot_Practise-SELF.models;

public class Vehicle {
    private String licensePlate;
    private VehicleTypes vehicleType;

    public Vehicle(String licensePlate, VehicleTypes vehicleType)
    {
        this.licensePlate=licensePlate;
        this.vehicleType=vehicleType;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public VehicleTypes getVehicleType()
    {
        return vehicleType;
    }
}
