package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.ParkingStrategy;


import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.ParkingSpot;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.VehicleType;
import java.util.List;

public interface ParkingStrategy {
    public ParkingSpot parkingSpot(List<ParkingSpot> spots,VehicleType vehicleType);
}
