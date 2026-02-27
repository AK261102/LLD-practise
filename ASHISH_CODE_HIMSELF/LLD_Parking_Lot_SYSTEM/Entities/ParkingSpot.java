package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities;

import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.SpotType;

public class ParkingSpot {
    private int spotId;
    private SpotType spotType;
    private ParkingFloor floor;
    private boolean isOccupied;
    private Vehicle vehicle;
    
    public ParkingSpot(int spotId,SpotType spotType,ParkingFloor floor)
    {
        this.spotId=spotId;
        this.spotType=spotType;
        this.floor=floor;
        this.isOccupied=false;
        this.vehicle=null;
    }

     public boolean isAvailable() {
      return !isOccupied;
     }

  public SpotType getSpotType() {
      return spotType;
  }

    public boolean parkVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;
        this.isOccupied=true;
        return true;
    }
    public boolean unparkVehicle()
    {
        this.vehicle=null;
        this.isOccupied=false;
        return false;
    }
}
