package PRACTISE.Parking_Alot.Vehicles;


/**
 * ══════════════════════════════════════════════════════════════════
 *                 STEP 3: VEHICLE FACTORY
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ FACTORY PATTERN ⭐
 * 
 * WHY FACTORY?
 * ────────────
 * Instead of:
 *   Vehicle v1 = new Bike("MH-01-AB-1234");
 *   Vehicle v2 = new Car("MH-02-CD-5678");
 *   // Scattered 'new' everywhere
 * 
 * Use Factory:
 *   Vehicle v1 = VehicleFactory.createVehicle(BIKE, "MH-01-AB-1234");
 *   Vehicle v2 = VehicleFactory.createVehicle(CAR, "MH-02-CD-5678");
 *   // One place to create all vehicles
 * 
 * BENEFITS:
 * - Centralized creation logic
 * - Easy to add new vehicle types
 * - Consistent object creation
 */

public class VehicleFactory {
    
    public static Vehicle createVehicle(VehicleType type, String licensePlate)
    {
        switch (type) {
            case "bike":
                return new Bike(licensePlate);
                break;
        
            default:
                break;
        }
    }
}
