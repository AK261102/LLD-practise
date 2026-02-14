package ASHISH_CODE_HIMSELF.Parking_Lot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import ASHISH_CODE_HIMSELF.Parking_Lot.Fee.FeeCalculator;
import ASHISH_CODE_HIMSELF.Parking_Lot.Fee.HourRateFeeCalculator;
import ASHISH_CODE_HIMSELF.Parking_Lot.Fee.VehicleSpotMapper;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingFloor;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingSpot;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.SpotType;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.Ticket;
import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.Vehicle;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floors;
    private Map<String,Ticket> activeTickets;
    private FeeCalculator feeCalculator;
    private AtomicInteger ticketCounter;

    private ParkingLot(){
        floors = new ArrayList<>();
        activeTickets = new ConcurrentHashMap<>();
        feeCalculator = new HourRateFeeCalculator();
        ticketCounter = new AtomicInteger(0);
    }

    public static synchronized ParkingLot getInstance()
    {
        if(instance==null)
        {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addFloor(ParkingFloor floor)
    {
        floors.add(floor);
    }

    public Ticket parkTicket(Vehicle vehicle)
    {
        SpotType required = VehicleSpotMapper.getRequiredSpot(vehicle.getType());

        for(ParkingFloor floor: floors)
        {
            ParkingSpot spot = floor.findAvaliableSpot(required);
            if(spot!=null && spot.parkedVehicle(vehicle))
            {
                String ticketId = "T-"+ticketCounter.incrementAndGet();
                Ticket ticket = new Ticket(ticketId, vehicle, spot);
                activeTickets.put(vehicle.getLicensePlate(), ticket);
                System.out.println("Parked " + vehicle.getLicensePlate()+ " at Floor " + floor.getFloorNumber()+ ", Spot " + spot.getSpotId());
                return ticket;
            }
        }
         System.out.println("No spot available for " + vehicle.getLicensePlate());
        return null;
    }

    public double unparkVehicle(String licensePlate)
    {
        Ticket ticket = activeTickets.remove(licensePlate);
        if(ticket==null)
        {
            System.out.println("No active ticket for "+licensePlate);
            return 0;
        }
        ticket.markExit();
        ticket.getSpot().removeVehicle();
        double fee = feeCalculator.calculateFee(ticket);
        System.out.println(licensePlate + " exited. Fee: ₹" + fee);
        return fee;
    }

     // ---------- DISPLAY ----------
    public void displayAvailability() {
        for (ParkingFloor floor : floors) {
            System.out.println("Floor " + floor.getFloorNumber()
                + " | Small: " + floor.getAvailableCount(SpotType.SMALL)
                + " | Medium: " + floor.getAvailableCount(SpotType.MEDIUM)
                + " | Large: " + floor.getAvailableCount(SpotType.LARGE));
        }
    }
    
}
