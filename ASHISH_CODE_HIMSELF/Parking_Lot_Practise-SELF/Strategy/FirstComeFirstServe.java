package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import ASHISH_CODE_HIMSELF.Factory_Pattern_Practise.VehiceType;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingFloor;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingSpot;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.VehicleType;
import PRACTISE.Parking_Alot.spots.parkingSpot;

-SELF.Strategy;

public class FirstComeFirstServe implements ParkingStrategy {
    @Override
    public parkingSpot findSpot(List<ParkingFloor> floors,VehiceType types)
    {
        for(ParkingFloor floor: floors)
        {
            ParkingSpot spot = floor.findAvaliableSpot(types);
            if(spot!=null)
            {
                return spot;
            }
        }
        return null;
    }
}
