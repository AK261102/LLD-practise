package PRACTISE.Parking_Alot.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ══════════════════════════════════════════════════════════════════
 *                      STEP 9: TICKET
 * ══════════════════════════════════════════════════════════════════
 * 
 * Parking ticket issued when vehicle enters
 * 
 * Contains:
 *   - Ticket number
 *   - Vehicle details
 *   - Spot assigned
 *   - Entry time
 * 
 * 
 * SAMPLE TICKET:
 * ──────────────
 *   ┌────────────────────────────────────────┐
 *   │          PARKING TICKET                │
 *   │────────────────────────────────────────│
 *   │  Ticket #: T-20231215-001             │
 *   │  Vehicle:  CAR [MH-12-AB-1234]        │
 *   │  Spot #:   C5                         │
 *   │  Floor:    1                          │
 *   │  Entry:    15-Dec-2023 10:30 AM       │
 *   └────────────────────────────────────────┘
 */

public class Ticket {
    private static int ticketcounter=0;
    private String ticketNumber;
    private Vehicle vehicle;
    private ParkingSpot spot;
    private LocalDateTime entryTime;

    public Ticket(Vehicle vehicle,ParkingSpot spot)
    {
        this.ticketNumber=generateTicket();
        this.vehicle=vehicle;
        this.spot=spot;
        this.entryTime=entryTime;
    }
    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.ticketNumber = generateTicketNumber();
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }
    
    /**
     * Generate unique ticket number
     * Format: T-YYYYMMDD-XXX
     */
    private String generateTicketNumber() {
        ticketCounter++;
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return "T-" + date + "-" + String.format("%03d", ticketCounter);
    }
    
    // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public String getTicketNumber() {
        return ticketNumber;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public ParkingSpot getSpot() {
        return spot;
    }
    
    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
