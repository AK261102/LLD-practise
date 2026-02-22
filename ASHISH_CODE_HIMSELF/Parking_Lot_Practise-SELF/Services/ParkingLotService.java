package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import ASHISH_CODE_HIMSELF.Parking_Lot.Fee.FeeCalculator;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingFloor;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingSpot;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.Ticket;

-SELF.Services;

public class ParkingLotService {
    private static ParkingLotService instance;
    private List<ParkingFloor> floors;
    private ParkingStrategy parkingStrategy;
    private FeeCalculator feecalculator;
    private Map<String,ticket> activetickets;// ticketId -> ticket
    private Map<String,ticket> vehicleTicketMap; // licensePLate -> ticket
    private int ticketCounter;

    private ParkingLotService{
        this.floors=new ArrayList<>();
        this.parkingStrategy=new FirstComeFirstServe();
        this.feecalculator=new FeeCalculator();
        this.activetickets=new HashMap<>()
        this.vehicleTicketMap=new HashMap<>();
        this.ticketCounter=0;
    }

    public static ParkingLotService getInstance()
    {
        if(instance==null)
        {
            instance= new ParkingLotService();
        }
        return instance;
    }

    public void addFloor(ParkingFloor floor)
    {
        floors.add(floor);
    }

    public void setStrategy(ParkingStrategy strategy)
    {
        this.parkingStrategy=strategy;
    }

    public Ticket parkVehicle(Vehicle vehicle)
    {
        if(vehicleTicketMap.containsKey(vehicle.getLiscenePlate))
        {
            // throw illegal
        }

        ParkingSpot spot = parkingStrategy.findSpot(floors,vehicle.getType);
        if(spot==null)
        {
            // runtime
        }
        spot.parkedVehicle(vehicle);
        ticketCounter++;
        String ticketId= "XXX-"+String.format("%04", ticketCounter);
        Ticket ticket =new Ticket(ticketId, vehicle, spot);
        activetickets.put(ticketId,ticket);
        vehicleTicketMap.put(vehicle.getLiscenePlate,ticket);
        return ticket;
    }

    public double unparkVehicle(String licensePlate, LocalDateTime exitTIme)
    {
        Ticket ticket = vehicleTicketMap.get(licensePlate);
        if(ticket==null)
        {
            // illegalArgyment exocption
        }
        ticket.markExit();;
        double fee= feecalculator.calculateFee(ticket);
        ParkingSpot spot = ticket.getSpot();
        spot.removeVehicle();
        return fee;
    }
}
