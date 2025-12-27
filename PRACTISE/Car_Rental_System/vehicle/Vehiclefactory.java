package PRACTISE.Car_Rental_System.vehicle;

import PRACTISE.Parking_Alot.Vehicles.VehicleType;

/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 4: VEHICLE FACTORY
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ FACTORY PATTERN ⭐
 * 
 * WHY FACTORY?
 * ────────────
 * Different vehicle types need different classes:
 *   ECONOMY → EconomyVehicle
 *   SUV → SUVVehicle
 *   LUXURY → LuxuryVehicle
 * 
 * Factory centralizes this creation logic!
 * 
 * 
 * USAGE:
 * ──────
 *   Vehicle car = VehicleFactory.createVehicle(
 *       VehicleType.SUV,
 *       "MH-12-AB-1234",
 *       "Toyota Fortuner",
 *       2000.0
 *   );
 */

public class Vehiclefactory {
    
    public static Vehicle createVehicle(VehicleType type, String regisrationNumber, String model,double baseRentalPice)
    {
        switch (type) {
            case EconomyVehicle:
                return new EconomyVehicle(regisrationNumber, model, baseRentalPice);

        
            default:
                break;
        }
    }
}
