package ASHISH_CODE_HIMSELF.Delivery_Fee_System.FeeModifier;

public class FragileModifierStrategy {
    @Override
    public double modify(double current,DeliveryRequest request)
    {
        return request.getWeight>10 ? current*1.5:current;
    }
}
