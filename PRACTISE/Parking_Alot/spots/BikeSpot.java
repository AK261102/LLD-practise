package PRACTISE.Parking_Alot.spots;

import PRACTISE.Parking_Alot.Vehicles.VehicleType;

public class BikeSpot extends parkingSpot {
    public BikeSpot(int spotNumber)
    {
        super(spotNumber,VehicleType.BIKE);
    }
    @Override
    public boolean canParkVehicle(Vehicle vehicle)
    {
        return vehicle.getType()==VehicleType.BIKE;
    }
}
