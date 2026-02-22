package ASHISH_CODE_HIMSELF.Parking_Lot_Practise



-SELF.Enums;

public class SpotType {
    COMPACT(30.0,VehicleTypes.BIKE);
    REGULAR(50.0,VehicleTypes.CAR);
    LARGE(100.0,VehicleTypes.TRUCK);

    private double hourlyRate;
    private VehicleTypes vehicle;

    public SpotType(double hourlyRate, VehicleTypes vehicle)
    {
        this.hourlyRate=hourlyRate;
        this.vehicle=vehicle;
    }

    public double getPrice()
    {
        return hourlyRate;
    }

    public VehicleTypes getVehicleTypes()
    {
        return vehicle;
    }

    public boolean canFit(VehicleTypes vehicleTypes)
    {
        return this.vehicle == vehicleTypes;
    }
}
