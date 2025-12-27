package PRACTISE.Car_Rental_System.vehicle;

import PRACTISE.Parking_Alot.Vehicles.VehicleType;

public class EconomyVehicle extends Vehicle {
    private static final double rate=1.0;

    public EconomyVehicle(String registrationNumber, String model, double baseRentalPrice)
    {
        super(registrationNumber, model, VehicleType.EconomyVehicle, baseRentalPrice);
    }

    @Override
    public double calculateRentalFee(int days)
    {
        return getBaseRentalPrice()*days*rate;
    }
}
