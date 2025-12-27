package PRACTISE.Car_Rental_System.reservation;

import java.util.HashMap;
import java.util.Map;

import PRACTISE.Car_Rental_System.store.Rentalstore;
import PRACTISE.Car_Rental_System.vehicle.Vehicle;

public class ReservationManager {
     private Map<Integer, Reservation> reservations;
    private int nextReservationId;
    
    // ─────────────────────────────────────────────────────────────
    // CONSTRUCTOR
    // ─────────────────────────────────────────────────────────────
    
    public ReservationManager() {
        this.reservations = new HashMap<>();
        this.nextReservationId = 1001;  // Start from 1001
    }

    public Reservation createReservation(User user, Vehicle vehicle, Rentalstore pickupStore, Rentalstore rentalstore,Date  startDate, Date endDate)
    {
        Reservation reservation = new Reservation(nextReservationId, null, vehicle, null, null, null, null) ;
        reservation.put(reservation.getId(), reservation);

        return reservation;
    }
}
