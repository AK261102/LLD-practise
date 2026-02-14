package ASHISH_CODE_HIMSELF.Parking_Lot.Utils;

import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber, List<ParkingSpot> spots)
    {
        this.floorNumber=floorNumber;
        this.spots=spots;
    }

    public ParkingSpot findAvaliableSpot(SpotType requiredType)
    {
        for(ParkingSpot it:spots)
        {
            if(it.isAvaliable() && it.getSpotType() == requiredType)
            {
                return it;
            }
        }
        return null;
    }

    public int getAvailableCount(SpotType requiredType)
    {
        int cnt = 0;
        for(ParkingSpot it : spots)
        {
            if(it.isAvaliable() && it.getSpotType() == requiredType)
                cnt++;
        }
        return cnt;
    }

    public int getFloorNumber()
    {
        return floorNumber;
    }
}
