package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import ASHISH_CODE_HIMSELF.Factory_Pattern_Practise.VehiceType;

-SELF.models;

public class ParkingSpot {
    private String spotId;
    private SpotType spotType;
    private int floorNumber;
    private VehicleTypes parkVehicle;

    public ParkingSpot(String spotId, SpotType spotType, int floorNumber, VehicleTypes parkVehicle)
    {
        this.spotId=spotId;
        this.spotType=spotType;
        this.floorNumber=floorNumber;
        this.parkVehicle=null;
    }

    public boolean isAvaliable()
    {
        return parkVehicle==null;
    }
    public boolean canFit(VehicleTypes vehicle)
    {
        return isAvaliable() && VehiceTypes.canFit(vehicle.getType());
    }

    public void parkingVehicle(VehiceType vehicle)
    {
        if(!isAvaliable())
        {
            /**
             *throw new IllegalStateException("Spot " + spotId + " is already occupied!");
             */
        }
        if(!isAvaliable() && VehicleTypes.canFit(vehicle))
        {
            /**
             *     throw new IllegalArgumentException(vehicle.getType() + " cannot fit in " + spotType + " spot!");
             */
        }
        this.parkVehicle=vehicle;
    }

    public Vehicle removeVehicle()
    {
        if(isAvaliable())
        {
            /**
             * throw illegal state exception
             */
        }
        Vehicle vehicle = this.parkVehicle;
        this.parkVehicle=null;
        return vehicle;
    }

     // ===== Getters =====

    public String getSpotId() {
        return spotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
