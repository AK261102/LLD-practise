package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities;

import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.VehicleType;

public class Vehicle {
    private final String licensePlate;
    private final VehicleType type;
    public Vehicle(String licensePlate,VehicleType type)
    {
        this.licensePlate=licensePlate;
        this.type=type;
    }
    public String getLicensePlate()
    {
        return licensePlate;
    }
    public VehicleType getVehicleType()
    {
        return type;
    }
}
