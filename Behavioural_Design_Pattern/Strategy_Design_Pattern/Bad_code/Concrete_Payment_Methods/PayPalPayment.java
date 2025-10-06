package Behavioural_Design_Pattern.Strategy_Design_Pattern.Bad_code.Concrete_Payment_Methods;

import Behavioural_Design_Pattern.Strategy_Design_Pattern.Bad_code.PaymentMethod;

public class PayPalPayment implements PaymentMethod  {
    public void processPayment(){
        System.out.println("this payment through paypal");
    }
}
