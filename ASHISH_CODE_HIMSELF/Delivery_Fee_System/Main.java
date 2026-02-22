package ASHISH_CODE_HIMSELF.Delivery_Fee_System;

import ASHISH_CODE_HIMSELF.Delivery_Fee_System.FeeCalculator.StandardFeeStrategy;

public class Main {
    public static void main(String[] args) {
        DeliveryRequest request = new DeliveryRequest("DEl-001",30.0,DeliveryZone.LOCAL,true);
        DeliveryFeeCalculator standardServie = new DeliveryFeeCalculator(new StandardFeeStrategy(),null );

        
    }
}
