package ASHISH_CODE_HIMSELF.Parking_Lot.Utils;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot spot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String ticketId, Vehicle vehicle,ParkingSpot spot)
    {
        this.ticketId=ticketId;
        this.vehicle=vehicle;
        this.spot=spot;
        this.entryTime=LocalDateTime.now();
    }

    public void markExit()
    {
        this.exitTime=LocalDateTime.now();
    }
    // all getters
    public String getTicketId() { return ticketId; }
    public Vehicle getVehicle() { return vehicle; }
    public ParkingSpot getSpot() { return spot; }
    public LocalDateTime getEntryTime() { return entryTime; }
    public LocalDateTime getExitTime() { return exitTime; }
}
