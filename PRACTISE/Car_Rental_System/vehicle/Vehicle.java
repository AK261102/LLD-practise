package PRACTISE.Car_Rental_System.vehicle;

import PRACTISE.Car_Rental_System.core.VehicleStatus;
import PRACTISE.Car_Rental_System.core.VehicleType;

public abstract class Vehicle {
     

    public String regisrationNumber;
    public String model;
    public VehicleType type;
    public VehicleStatus status;
    public double baseRentalPice;

    public Vehicle(String regisrationNumber, String model, VehicleType type, double baseRentalPice)
    {
        this.regisrationNumber =regisrationNumber;
        this.model = model;
        this.type = type;
        this.baseRentalPice =baseRentalPice;
        this.status = VehicleStatus.AVAILABLE;
    }

    public abstract double calculateRentalFee(int days);

    public void markAvaliable()
    {
        this.status = VehicleStatus.AVAILABLE;
    }

     public void markReserved() {
        this.status = VehicleStatus.RESERVED;
    }
    
    public void markRented() {
        this.status = VehicleStatus.RENTED;
    }
    
    public void markMaintenance() {
        this.status = VehicleStatus.MAINTENANCE;
    }
    
    public boolean isAvailable() {
        return status == VehicleStatus.AVAILABLE;
    }

     
    // ─────────────────────────────────────────────────────────────
    // GETTERS AND SETTERS
    // ─────────────────────────────────────────────────────────────
    
    public String getRegistrationNumber() { return registrationNumber; }
    public String getModel() { return model; }
    public VehicleType getType() { return type; }
    public VehicleStatus getStatus() { return status; }
    public double getBaseRentalPrice() { return baseRentalPrice; }
    
    public void setStatus(VehicleStatus status) { 
        this.status = status; 
    }
    
}
