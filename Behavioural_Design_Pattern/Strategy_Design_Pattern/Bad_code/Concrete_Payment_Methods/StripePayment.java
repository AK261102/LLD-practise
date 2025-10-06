package Behavioural_Design_Pattern.Strategy_Design_Pattern.Bad_code.Concrete_Payment_Methods;

import Behavioural_Design_Pattern.Strategy_Design_Pattern.Bad_code.PaymentMethod;

public class StripePayment implements PaymentMethod {
    public void processPayment(){
        System.err.println("This payment is done using stripe");
    }
}
