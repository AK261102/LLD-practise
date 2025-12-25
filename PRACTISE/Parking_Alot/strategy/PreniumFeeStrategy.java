package PRACTISE.Parking_Alot.strategy;

import PRACTISE.Parking_Alot.core.Durationtype;

public class PreniumFeeStrategy implements ParkingFeeStrategy {
    // Premium hourly rates (higher than basic)
    private static final double BIKE_HOURLY_RATE = 20.0;
    private static final double CAR_HOURLY_RATE = 40.0;
    private static final double TRUCK_HOURLY_RATE = 60.0;
    
    @Override
    public double calculateFee(VehicleType vehicleType, int duration,Durationtype durationtype)
    {
        switch (vehicleType) {
            int rate
            case BIKE:     
                return BIKE_HOURLY_RATE
                break;
        
            default:
                break;
        }
        if(durationtype==durationtype.HOURS)
            return rate*duration;
    }

}
