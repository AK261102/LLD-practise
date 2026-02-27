package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.ParkingFloor;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.ParkingSpot;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.Ticket;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.Vehicle;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.ParkingStrategy.ParkingStrategy;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.PricingStrategy.PricingStrategy;


public class ParkingLotService {
    private static ParkingLotService instance;
    private ParkingLotService(){};
    public static ParkingLotService getInstance()
    {
        if(instance==null)
        {
            instance=new ParkingLotService();
        }
        return instance;
    }

    private List<ParkingFloor> floor;
    private Map<String,Ticket> activeTicketMap=new HashMap<>();
    private ParkingStrategy parkingStrategy;
    private PricingStrategy pricingStrategy;
     public void applyParkingStrategy(ParkingStrategy parkingStrategy) {
      this.parkingStrategy = parkingStrategy;
  }

    public void applyPricingStrategy(PricingStrategy pricingStrategy)
    {
        this.pricingStrategy=pricingStrategy;
    }

    public Ticket parkVehicle(Vehicle vehicle)
    {
        // Ticket ticket= new Ticket(vehicle.getLicensePlate(),vehicle.getVehicleType(),vehicle,parkSpot);
        // String ticketuuid = UUID.randomUUID().toString();
        // activeTicketMap.put(ticketuuid,ticket);
        // return ticket;
        ArrayList<ParkingSpot> allSpots = new ArrayList<>(); 
        for(ParkingFloor f: floor)
        {
            allSpots.addAll(f.getSpots());
        }
        ParkingSpot spot = parkingStrategy.parkingSpot(allSpots, vehicle.getVehicleType());
         if (spot == null) {
      throw new RuntimeException("No spot available");
  }
  spot.parkVehicle(vehicle);
   String ticketId=UUID.randomUUID().toString();
        Ticket ticket = new Ticket(ticketId, vehicle.getVehicleType(), vehicle, spot);
       
        activeTicketMap.put(ticketId,ticket);
        return ticket;
    }
    
    public double unparkVehicle(String ticketId)
    {
        Ticket ticket=activeTicketMap.get(ticketId);
        ticket.setExitTime();
        double fee= this.pricingStrategy.calculateFee(ticket, ticket.getVehicle());
        activeTicketMap.remove(ticketId);
        ticket.getParkingSpot().unparkVehicle();
        return fee;
    }
      public void setFloors(List<ParkingFloor> floor) {
      this.floor = floor;
  }
}
