package PRACTISE.Parking_Alot.core;

import PRACTISE.Parking_Alot.Vehicles.VehicleType;
import PRACTISE.Parking_Alot.spots.parkingSpot;

/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 7: PARKING FLOOR
 * ══════════════════════════════════════════════════════════════════
 * 
 * For multi-floor parking lots
 * 
 * Each floor:
 *   - Has a floor number
 *   - Contains multiple parking spots
 *   - Can find available spots for a vehicle type
 * 
 * 
 * VISUALIZATION:
 * ──────────────
 *   
 *   FLOOR 1:
 *   ┌─────────────────────────────────────────────────────────┐
 *   │  🏍️ │ 🏍️ │ 🏍️ │ 🚗 │ 🚗 │ 🚗 │ 🚗 │ 🚛  │ 🚛  │
 *   │  B1 │ B2 │ B3 │ C1 │ C2 │ C3 │ C4 │ T1  │ T2  │
 *   └─────────────────────────────────────────────────────────┘
 *   
 *   FLOOR 2:
 *   ┌─────────────────────────────────────────────────────────┐
 *   │  🏍️ │ 🏍️ │ 🚗 │ 🚗 │ 🚗 │ 🚗 │ 🚗 │ 🚗  │
 *   │  B4 │ B5 │ C5 │ C6 │ C7 │ C8 │ C9 │ C10 │
 *   └─────────────────────────────────────────────────────────┘
 */

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber){
        this.floorNumber=floorNumber;
        this.spots=new ArrayList();
    }

    public void addSpot(ParkingSpot spot){
        spots.add(spot);
    }

    public void addSpot(VehicleType type,int count,int startSpotNumber){
        for(int i=0;i<count;i++)
        {
            ParkingSpot spot = ParkingSpotFactory.createSpot(type, startSpotNumber+i);
            spots.add(spot);
        }
    }

    public ParkingSpot findAvaliableSpot(VehicleType vehicleType)
    {
        for(parkingSpot spot:spots)
        {
            if(!spot.isOccupied())
                return spot;
        }
        return null;
    }
}
