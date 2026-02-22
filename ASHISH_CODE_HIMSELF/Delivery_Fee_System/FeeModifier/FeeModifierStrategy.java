package ASHISH_CODE_HIMSELF.Delivery_Fee_System.FeeModifier;

public interface FeeModifierStrategy {
    double modify(double currentFee, DeliveryRequest request);
}
