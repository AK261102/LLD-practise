package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingFloor;
import PRACTISE.Parking_Alot.spots.parkingSpot;

-SELF.Strategy;

public class NearestToEntryStrategy implements ParkingStrategy {
    
    @Override
    public parkingSpot findSpot(List<ParkingFloor> floors, vehiceType types)
    {
        for(ParkingFloor floor:floors)
        {
            List<ParkingSpot> available=floor.getavailableSpot(types);
            if(!available.isEmpty())
            {
                return available[0];
            }
        }
        return null;
    }
}
