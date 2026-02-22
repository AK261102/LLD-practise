package ASHISH_CODE_HIMSELF.Shipping_Tracking_System.Strategy;

public class StandardDelivery implements FeeStrategy {
    @Override
    public double feeTotal(double weight, double distance)
    {
        return weight*distance*12;
    }
}
