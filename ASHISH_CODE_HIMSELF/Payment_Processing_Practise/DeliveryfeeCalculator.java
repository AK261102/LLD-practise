package ASHISH_CODE_HIMSELF.Payment_Processing_Practise;

public class DeliveryfeeCalculator {
    private final <String, DeliveryFeeStrategy> mp =new HashMap<>();

    public void registerStrategies(DeliveryFeeStrategy strategy)
    {
        mp.add(strategy.getDeliveryType(),strategy);
    }

    public double calculateFee(double weight , double distance,String deliveryType)
    {
        DeliveryFeeStrategy strategy=mp.get(deliveryType);
        if(strategy==null)
        {
             throw new IllegalArgumentException("No strategy registered for: " + deliveryType);
        }
        return strategy.calculateFee(weight, distance);
    }
}
