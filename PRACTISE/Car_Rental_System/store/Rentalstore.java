package PRACTISE.Car_Rental_System.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import PRACTISE.Car_Rental_System.vehicle.Vehicle;

public class Rentalstore {
    private int id;
    private String name;
    private Location location;
    private Map<String, Vehicle> vehicle;

    public Rentalstore(int id,String name, Location location)
    {
        this.id=id;
        this.name= name;
        this.location = location;
        this.vehicle =new HashMap<>()
    }

    public void addVehicle(Vehicle vehicle)
    {
        vehicle.put(vehicle.getRegistrationNumber(),vehicle);
    }
     public void removeVehicle(String registrationNumber) {
        Vehicle removed = vehicles.remove(registrationNumber);
        if (removed != null) {
            System.out.println("✅ Removed " + removed.getModel() + " from " + name);
        }
    }
        */
    public Vehicle getVehicle(String registrationNumber) {
        return vehicles.get(registrationNumber);
    }
     // ─────────────────────────────────────────────────────────────
    // AVAILABILITY CHECK
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Get all available vehicles
     */
    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> available = new ArrayList<>();
        for (Vehicle vehicle : vehicles.values()) {
            if (vehicle.isAvailable()) {
                available.add(vehicle);
            }
        }
        return available;
    }
    
    /**
     * Get available vehicles of specific type
     */
    public List<Vehicle> getAvailableVehicles(VehicleType type) {
        List<Vehicle> available = new ArrayList<>();
        for (Vehicle vehicle : vehicles.values()) {
            if (vehicle.isAvailable() && vehicle.getType() == type) {
                available.add(vehicle);
            }
        }
        return available;
    }
    
    /**
     * Check if specific vehicle is available
     */
    public boolean isVehicleAvailable(String registrationNumber) {
        Vehicle vehicle = vehicles.get(registrationNumber);
        return vehicle != null && vehicle.isAvailable();
    }
    
    // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public int getId() { return id; }
    public String getName() { return name; }
    public Location getLocation() { return location; }
    public Collection<Vehicle> getAllVehicles() { return vehicles.values(); }
    public int getVehicleCount() { return vehicles.size(); }
    
    // ─────────────────────────────────────────────────────────────
    // DISPLAY
    // ─────────────────────────────────────────────────────────────
    
    public void displayInventory() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║  🏪 RENTAL STORE: " + name);
        System.out.println("║  📍 Location: " + location);
        System.out.println("║  🚗 Total Vehicles: " + vehicles.size());
        System.out.println("║  ✅ Available: " + getAvailableVehicles().size());
        System.out.println("╠══════════════════════════════════════════════╣");
        
        for (Vehicle v : vehicles.values()) {
            String status = v.isAvailable() ? "✅" : "❌";
            System.out.println("║  " + status + " " + v);
        }
        System.out.println("╚══════════════════════════════════════════════╝\n");
    }
    
    @Override
    public String toString() {
        return name + " (" + location + ")";
    }
    
}
