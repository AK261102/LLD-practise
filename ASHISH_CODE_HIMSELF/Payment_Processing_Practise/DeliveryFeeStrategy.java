package ASHISH_CODE_HIMSELF.Payment_Processing_Practise;

public interface DeliveryFeeStrategy {
    double calculateFee(double weight,double distance);
    String getDeliveryType();
}
