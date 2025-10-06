package Behavioural_Design_Pattern.Strategy_Design_Pattern.Good_code.Concrete_Payment_Methods;

import Behavioural_Design_Pattern.Strategy_Design_Pattern.Good_code.PaymentStrategy;

public class StripePayment implements PaymentStrategy {
    public void processPayment(){
        System.err.println("This payment is done using stripe");
    }
}
