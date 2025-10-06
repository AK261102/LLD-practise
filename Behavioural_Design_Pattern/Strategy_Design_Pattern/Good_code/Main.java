package Behavioural_Design_Pattern.Strategy_Design_Pattern.Good_code;


import Behavioural_Design_Pattern.Strategy_Design_Pattern.Good_code.Concrete_Payment_Methods.*;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy payPal = new PayPalPayment();
        PaymentStrategy crypto = new CryptoPayment();
        PaymentStrategy stripe = new StripePayment();

        PaymentProcessor processor=new PaymentProcessor(creditCard);
        processor.processPayment();
        processor.setPaymentStrategy(payPal);
        processor.processPayment();
        processor.setPaymentStrategy(stripe);
        processor.processPayment();
    }
}
