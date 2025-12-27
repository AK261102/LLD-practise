package PRACTISE.Car_Rental_System.reservation;

import PRACTISE.Car_Rental_System.core.ReversationStatus;
import PRACTISE.Car_Rental_System.core.User;
import PRACTISE.Car_Rental_System.store.Rentalstore;
import PRACTISE.Car_Rental_System.vehicle.Vehicle;

public class Reservation {
    

    private int id;
    private User user;
    private Vehicle vehicle;
    private Rentalstore pickupstore;
    private Rentalstore returnstore;
    private Date startDate;
    private Date endDate;
    private ReservationStatus status;
    private double totalAmount;

     public Reservation(int id, User user, Vehicle vehicle,
                       RentalStore pickupStore, RentalStore returnStore,
                       Date startDate, Date endDate) {
        this.id = id;
        this.user = user;
        this.vehicle = vehicle;
        this.pickupStore = pickupStore;
        this.returnStore = returnStore;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = ReservationStatus.PENDING;
        
        // Calculate total amount
        int days = calculateDays();
        this.totalAmount = vehicle.calculateRentalFee(days);
    }

    public boolean confirm()
    {
        if(status == ReversationStatus.PENDING)
        {
            status =ReversationStatus.CONFIRMED;
            vehicle.markReserved();
            return true;
        }
        return false;
    }
       public boolean startRental() {
        if (status == ReservationStatus.CONFIRMED) {
            status = ReservationStatus.IN_PROGRESS;
            vehicle.markRented();
            System.out.println("🚗 Rental #" + id + " STARTED - Vehicle picked up");
            return true;
        }
        System.out.println("❌ Cannot start - status is " + status);
        return false;
    }
    
    /**
     * Complete rental (vehicle returned)
     */
    public boolean complete() {
        if (status == ReservationStatus.IN_PROGRESS) {
            status = ReservationStatus.COMPLETED;
            vehicle.markAvailable();
            System.out.println("✅ Rental #" + id + " COMPLETED - Vehicle returned");
            return true;
        }
        System.out.println("❌ Cannot complete - status is " + status);
        return false;
    }
    
    /**
     * Cancel reservation
     */
    public boolean cancel() {
        if (status == ReservationStatus.PENDING || status == ReservationStatus.CONFIRMED) {
            status = ReservationStatus.CANCELED;
            vehicle.markAvailable();
            System.out.println("❌ Reservation #" + id + " CANCELED");
            return true;
        }
        System.out.println("❌ Cannot cancel - rental already in progress or completed");
        return false;
    }
    
    // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public int getId() { return id; }
    public User getUser() { return user; }
    public Vehicle getVehicle() { return vehicle; }
    public RentalStore getPickupStore() { return pickupStore; }
    public RentalStore getReturnStore() { return returnStore; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
    public ReservationStatus getStatus() { return status; }
    public double getTotalAmount() { return totalAmount; }



}
