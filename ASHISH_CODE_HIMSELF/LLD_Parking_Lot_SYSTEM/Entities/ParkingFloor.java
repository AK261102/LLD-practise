package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities;

import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.SpotType;


import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> spots;
    public ParkingFloor(int floorNumber,List<ParkingSpot> spots)
    {
        this.floorNumber=floorNumber;
        this.spots=spots;
    }

    public int getCountAvaliableSpot(SpotType type)
    {
        int cnt=0;
        for(ParkingSpot spot:spots)
        {
            if(spot.isAvailable() && spot.getSpotType() == type)
            {
                cnt++;
            }
        }
        return cnt;
    }

    public ParkingSpot ParkVehicle(Vehicle vehicle)
    {
        for(ParkingSpot spot:spots)
        {
            if(spot.isAvailable() )
            {
                // i have got the parking spot
                return spot;
            }
        }
        return null;
    }

    public void unParkVehicle(ParkingSpot spot)
    {
        spot.unparkVehicle();
        // here i have to make the spot empty.
    }

    public List<ParkingSpot> getSpots() { return spots; }

}
