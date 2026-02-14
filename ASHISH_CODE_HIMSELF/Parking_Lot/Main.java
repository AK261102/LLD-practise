package ASHISH_CODE_HIMSELF.Parking_Lot;

import java.util.List;

import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingFloor;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingSpot;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.SpotType;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.Vehicle;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.VehicleType;

public class Main {
    public static void main(String[] args) {
        
        ParkingLot lot = ParkingLot.getInstance();

        List<ParkingSpot> floor1Spots = List.of(
            new ParkingSpot(1, SpotType.SMALL),
            new ParkingSpot(2, SpotType.MEDIUM),
            new ParkingSpot(3, SpotType.MEDIUM),
            new ParkingSpot(4, SpotType.LARGE)
        );

        List<ParkingSpot> floor2Spots = List.of(
            new ParkingSpot(5, SpotType.SMALL),
            new ParkingSpot(6, SpotType.MEDIUM),
            new ParkingSpot(7, SpotType.LARGE)
        );

        lot.addFloor(new ParkingFloor(1, floor1Spots));
        lot.addFloor(new ParkingFloor(2, floor2Spots));

        lot.parkTicket(new Vehicle("KA-01-1234", VehicleType.CAR));
        lot.parkTicket(new Vehicle("KA-02-5678", VehicleType.BIKE));

        lot.displayAvailability();

        lot.unparkVehicle("KA-01-1234");
        lot.displayAvailability();
    }
}
