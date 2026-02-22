package ASHISH_CODE_HIMSELF.Payment_Processing_Practise;

public class Standard_Delivery implements DeliveryFeeStrategy {
    @Override
    public double calculateFee(double weight, int distance)
    {
        return weight*10+distance*1;
    }
    @Override
    public String getDeliveryType()
    {
        return "Standard";
    }
}
