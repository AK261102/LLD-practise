package ASHISH_CODE_HIMSELF.Strategy_Pattern_Practise;

public class WeekdayFeeStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(VehicleType type,double hours)
    {
        return hours*type.getVehicePrice();
    }
}
