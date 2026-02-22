package ASHISH_CODE_HIMSELF.Delivery_Fee_System;

import ASHISH_CODE_HIMSELF.Delivery_Fee_System.FeeCalculator.FreeCalculatorStrategy;
import ASHISH_CODE_HIMSELF.Delivery_Fee_System.FeeModifier.FeeModifierStrategy;

public class DeliveryFeeCalculator {
    private FreeCalculatorStrategy strategy;
    private FeeModifierStrategy modifier;

    public DeliveryFeeCalculator(FreeCalculatorStrategy strategy, FeeModifierStrategy modifer)
    {
        this.strategy=strategy;
        this.modifier=modifer;
    }

    public double calculateTotalFee(DeliveryRequest request)
    {
        double fee = strategy.calculateFee(request);
        fee=modifier.modify(fee, request);
        return fee;
    }
}
