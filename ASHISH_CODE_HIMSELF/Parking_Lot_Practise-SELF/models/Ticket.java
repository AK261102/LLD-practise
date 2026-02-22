package ASHISH_CODE_HIMSELF.Parking_Lot_Practise

import java.time.Duration;
import java.time.LocalDateTime;

import ASHISH_CODE_HIMSELF.Parking_Lot.Utils.ParkingSpot;

-SELF.models;

public class Ticket {
    private String ticketId;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String ticketId, ParkingSpot parkingSpot,Vehicle vehicle, LocalDateTime entryTime, LocalDateTime exitTime)
    {
        this.ticketId=ticketId;
        this.parkingSpot=parkingSpot;
        this.vehicle=vehicle;
        this.entryTime=entryTime;
        this.exitTime=null;
    }

    public void markExit()
    {
        if(this.exitTime!=null)
        {
            // this vehicle is already exit
        }
        this.exitTime=LocalDateTime.now();
    }

    public int getParkingDuration()
    {
        LocalDateTime exit= exitTime!=null ? exitTime:LocalDateTime.now();
        long minutes=Duration.between(entryTime, exit).toMinutes();
        return Math.ceil(minutes/60.0);
    }

    // ===== Getters =====

    public String getTicketId() { return ticketId; }
    public Vehicle getVehicle() { return vehicle; }
    public ParkingSpot getAssignedSpot() { return assignedSpot; }
    public LocalDateTime getEntryTime() { return entryTime; }
    public LocalDateTime getExitTime() { return exitTime; }


}
