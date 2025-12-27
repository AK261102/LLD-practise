package PRACTISE.Car_Rental_System.core;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String drivingLicense;
    private List<Reservation> reservations;

    public User(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
        this.reservations=new ArrayList<>();
    }


    // ─────────────────────────────────────────────────────────────
    // RESERVATION MANAGEMENT
    // ─────────────────────────────────────────────────────────────
    
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    
    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }
    
    public List<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }
    
    public int getReservationCount() {
        return reservations.size();
    }
    
    // ─────────────────────────────────────────────────────────────
    // GETTERS AND SETTERS
    // ─────────────────────────────────────────────────────────────
    
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getDrivingLicense() { return drivingLicense; }
    
    public void setPhone(String phone) { this.phone = phone; }
    public void setDrivingLicense(String drivingLicense) { 
        this.drivingLicense = drivingLicense; 
    }
    
}
