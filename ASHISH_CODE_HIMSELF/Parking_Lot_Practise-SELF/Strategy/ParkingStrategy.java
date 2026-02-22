package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingFloor;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingSpot;

-SELF.Strategy;

public interface ParkingStrategy {
    
    ParkingSpot findSpot(List<ParkingFloor> floors, VehicleTypes types);
}
