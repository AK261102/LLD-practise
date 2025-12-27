package PRACTISE.Car_Rental_System.pricing;

import PRACTISE.Car_Rental_System.vehicle.Vehicle;

public class HourlyPricingStrategy implements PricingStrategy{
    private static final double rate= 0.2;

    @Override
    public double calculatePrice(Vehicle vehicle,int hours)
    {
        return vehicle.getBaseRentalPrice()*rate*hours;
    }
    
}
