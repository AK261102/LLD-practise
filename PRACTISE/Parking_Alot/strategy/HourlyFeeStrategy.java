package PRACTISE.Parking_Alot.strategy;

import PRACTISE.Parking_Alot.Vehicles.Bike;
import PRACTISE.Parking_Alot.core.Durationtype;

public class HourlyFeeStrategy implements ParkingFeeStrategy {
     private static final double BIKE_HOURLY_RATE = 10.0;
    private static final double CAR_HOURLY_RATE = 20.0;
    private static final double TRUCK_HOURLY_RATE = 30.0;
    
    @Override
    public double calculateFee(VehicleType vehicletype,int duration, Durationtype durationtype)
    {
        double hourlyRate;
        switch (vehicletype) {
            case Bike:
                hourlyRate=BIKE_HOURLY_RATE;
                break;
        
            default:
                break;
        }
        if(durationtype==Durationtype.HOURS)
            return duration*hourlyRate;
        else
            return ;
    }
}
