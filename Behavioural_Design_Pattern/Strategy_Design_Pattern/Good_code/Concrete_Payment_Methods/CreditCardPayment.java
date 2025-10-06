package Behavioural_Design_Pattern.Strategy_Design_Pattern.Good_code.Concrete_Payment_Methods;

import Behavioural_Design_Pattern.Strategy_Design_Pattern.Good_code.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    public void processPayment(){
        System.out.println("this payment through stripe payment");
    }
}
