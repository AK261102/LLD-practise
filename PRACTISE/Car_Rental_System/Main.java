package PRACTISE.Car_Rental_System;

import PRACTISE.Car_Rental_System.core.RentalSystem;
import PRACTISE.Car_Rental_System.core.VehicleStatus;
import PRACTISE.Car_Rental_System.payment.Paymentstrategy;
import PRACTISE.Car_Rental_System.reservation.Reservation;
import PRACTISE.Car_Rental_System.store.Location;
import PRACTISE.Car_Rental_System.store.Rentalstore;
import PRACTISE.Car_Rental_System.vehicle.Vehicle;
import PRACTISE.Car_Rental_System.vehicle.Vehiclefactory;
import PRACTISE.Parking_Alot.Vehicles.VehicleType;

public class Main {
    public static void main(String[] args) {
        RentalSystem system = RentalSystem.getInstance();

        Location mumbai = new Location("xyz", "mumbai", "MH", "nsdknvk");

        Rentalstore store = new Rentalstore(1, "Mumbai", mumbai);

        system.addStore(store);

        Vehicle bmw = Vehiclefactory.createVehicle(VehicleType.LUX, "xyz", "kjsd v ", 4);

        store.addVehicle(bmw);
        User Ashish = system.registerUser("AShish", "@nsdv");

        Reservation  reservation = system.createReservation(0, null, 0, 0, null, null)  ;
        if(reservation!=null)
        {
            Paymentstrategy payment= new UpiPayment("insdinv");
            boolean paid =system.processPayment(reservation.getId(),payment)
        }
    }
}
