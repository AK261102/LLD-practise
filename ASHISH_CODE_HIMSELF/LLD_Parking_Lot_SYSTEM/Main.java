package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM;

import java.util.ArrayList;

import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.ParkingFloor;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.ParkingSpot;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.Ticket;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.Vehicle;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.SpotType;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.VehicleType;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.ParkingStrategy.BikeParking;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.PricingStrategy.BikePricing;


public class Main {
    public static void main(String[] args) {
        ParkingSpot spot1=new ParkingSpot(1, SpotType.SMALL, null);
        ParkingSpot spot2=new ParkingSpot(2, SpotType.SMALL, null);
        ParkingSpot spot3=new ParkingSpot(3, SpotType.MEDIUM, null);

        ArrayList parkingSpots=new ArrayList<>();
        parkingSpots.add(spot1);
        parkingSpots.add(spot2);
        parkingSpots.add(spot3);
        ParkingFloor floor1= new ParkingFloor(1, parkingSpots);

        ParkingLotService service = ParkingLotService.getInstance();
        ArrayList<ParkingFloor> floors = new ArrayList<>();
        floors.add(floor1);
        service.setFloors(floors);
        service.applyParkingStrategy(new BikeParking());
        service.applyPricingStrategy(new BikePricing());
        Vehicle bike = new Vehicle("23y5y48", VehicleType.BIKE);
        Ticket ticket=service.parkVehicle(bike);
        double fee = service.unparkVehicle(ticket.getTicketId());

         System.out.println("Fee: " + fee);
    }
}
