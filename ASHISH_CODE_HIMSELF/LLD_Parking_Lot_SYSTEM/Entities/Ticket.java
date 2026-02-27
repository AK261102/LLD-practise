package ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities;

import java.time.LocalDateTime;

import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Enum.VehicleType;
import ASHISH_CODE_HIMSELF.LLD_Parking_Lot_SYSTEM.Entities.ParkingSpot;



public class Ticket {
    private String ticketid;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private VehicleType type;
    private Vehicle vehicle;
    private ParkingSpot parkSpot;
    public Ticket(String ticketId, VehicleType type,Vehicle vehicle,ParkingSpot parkSpot)
    {
        this.ticketid=ticketId;
        this.entryTime=LocalDateTime.now();
        this.type=type;
        this.vehicle=vehicle;
        this.parkSpot=parkSpot;
    }

    public String getTicketId()
    {
        return ticketid;
    }
    
    public LocalDateTime getEntryTime()
    {
        return entryTime;
    }

    public LocalDateTime getExitTime()
    {
        return exitTime;
    }

    public VehicleType getVehicleType()
    {
        return vehicle.getVehicleType();
    }
    public Vehicle getVehicle()
    {
        return vehicle;
    }
    public void setExitTime()
    {
        this.exitTime=LocalDateTime.now();
    }    
    public ParkingSpot getParkingSpot()
    {
        return parkSpot;
    }
}
