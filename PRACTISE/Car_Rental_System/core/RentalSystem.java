package PRACTISE.Car_Rental_System.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Behavioural_Design_Pattern.Strategy_Design_Pattern.Good_code.PaymentProcessor;
import PRACTISE.Car_Rental_System.reservation.Reservation;
import PRACTISE.Car_Rental_System.reservation.ReservationManager;

public class RentalSystem {
    
    public static RentalSystem instance;

      private List<RentalStore> stores;
    private Map<Integer, User> users;
    private ReservationManager reservationManager;
    private PaymentProcessor paymentProcessor;
    private int nextUserId;
    
     private RentalSystem() {
        this.stores = new ArrayList<>();
        this.users = new HashMap<>();
        this.reservationManager = new ReservationManager();
        this.paymentProcessor = new PaymentProcessor();
        this.nextUserId = 1;
    }

    public static RentalSystem getInstance()
    {
        if(instance==null)
            instance = new RentalSystem();
        return instance;
    }

      public void addStore(RentalStore store) {
        stores.add(store);
        System.out.println("✅ Added store: " + store.getName());
    }
    
    public RentalStore getStore(int storeId) {
        for (RentalStore store : stores) {
            if (store.getId() == storeId) {
                return store;
            }
        }
        return null;
    }
    
    public List<RentalStore> getAllStores() {
        return new ArrayList<>(stores);
    }

     // ─────────────────────────────────────────────────────────────
    // USER MANAGEMENT
    // ─────────────────────────────────────────────────────────────
    
    public User registerUser(String name, String email) {
        User user = new User(nextUserId++, name, email);
        users.put(user.getId(), user);
        System.out.println("✅ Registered user: " + user.getName());
        return user;
    }
    
    public void addUser(User user) {
        if (users.containsKey(user.getId())) {
            System.out.println("❌ User with ID " + user.getId() + " already exists!");
            return;
        }
        users.put(user.getId(), user);
    }
    
    public User getUser(int userId) {
        return users.get(userId);
    }

    public Reservation createReservation(int userId, String vehicleRegNumber,
                                          int pickupStoreId, int returnStoreId,
                                          Date startDate, Date endDate)
                                          {
                                                User user = users.get(userId);
        RentalStore pickupStore = getStore(pickupStoreId);
        RentalStore returnStore = getStore(returnStoreId);
         return reservationManager.createReservation(
            user, vehicle, pickupStore, returnStore, startDate, endDate
        );

        public boolean processPayment(int reservationId, PaymentStrategy PaymentStrategy)
        {
            Reservation reservation = reservationManager.getReservation(reservationId);
            boolean succes = paymentProcessor.processPayment(reservation.getTotalAmount(), paymentProcessor);
        }
                                          }
    
}
