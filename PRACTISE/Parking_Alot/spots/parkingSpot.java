package PRACTISE.Parking_Alot.spots;

import Abstract_Design_Pattern.Good_Code.Interfaces.Vehicle;
import PRACTISE.Parking_Alot.Vehicles.VehicleType;

/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 6: PARKING SPOT CLASSES
 * ══════════════════════════════════════════════════════════════════
 * 
 * ParkingSpot is ABSTRACT because:
 *   - Different spot types for different vehicles
 *   - BikeSpot, CarSpot, TruckSpot have different canPark() logic
 *   - But all share common properties
 * 
 * 
 * VISUALIZATION:
 * ──────────────
 *   BIKE SPOT (small)    CAR SPOT (medium)    TRUCK SPOT (large)
 *   ┌───┐                ┌───────┐            ┌─────────────┐
 *   │🏍️│                │  🚗  │            │     🚛     │
 *   └───┘                └───────┘            └─────────────┘
 * 
 * 
 * CLASS HIERARCHY:
 * ────────────────
 *         ParkingSpot (abstract)
 *                │
 *       ┌────────┼────────┐
 *       ▼        ▼        ▼
 *   BikeSpot  CarSpot  TruckSpot
 */

public abstract class parkingSpot {
    public int spotNo;
    public VehicleType spottype;
    public boolean isOccupied;
    public Vehicle vehicle;
    
    public parkingSpot(int spotNo,VehicleType spotType)
    {
        this.spotNo=spotNo;
        this.spottype=spotType;
        this.isOccupied=false;
        this.vehicle=null;
    }

    public boolean isPark(Vehicle vehicle)
    {
        if(isOccupied)
            return "error";
        this.vehicle=vehicle;
        this.isOccupied=true;
    }

    public Vehicle vacate()
    {
        if(!isOccupied)
            return "error";
        VehicleType parkedVehicle= this.vehicle;
        this.vehicle=null;
        this.isOccupied=false;
        return parkedVehicle;
        // this returns the vehice that was parked
    }
     // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public int getSpotNumber() {
        return spotNumber;
    }
    
    public VehicleType getSpotType() {
        return spotType;
    }
    
    public boolean isOccupied() {
        return isOccupied;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    @Override
    public String toString() {
        return "Spot #" + spotNumber + " [" + spotType + "] " + 
               (isOccupied ? "OCCUPIED by " + vehicle : "AVAILABLE");
    }
}
