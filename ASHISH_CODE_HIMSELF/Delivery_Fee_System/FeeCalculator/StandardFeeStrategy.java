package ASHISH_CODE_HIMSELF.Delivery_Fee_System.FeeCalculator;

public class StandardFeeStrategy {
    @Override
    public double calculateFee(DeliveryRequest request)
    {
        return request.getDeliveryType*request.getZone*request;
    }
}
