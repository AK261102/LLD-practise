package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.ParkingStrategy;



import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.VehicleType;

import java.util.List;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.SpotType;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.ParkingSpot;

public class BikeParking implements ParkingStrategy {
    @Override
    public ParkingSpot parkingSpot(List<ParkingSpot> spots,VehicleType vehicleType)
    {
        // nearest parking spot 
        for(ParkingSpot spot:spots)
        {
            if(spot.isAvailable() && spot.getSpotType() == SpotType.SMALL)
            {
                return spot;
            }
        }
        return null;
    }
}
