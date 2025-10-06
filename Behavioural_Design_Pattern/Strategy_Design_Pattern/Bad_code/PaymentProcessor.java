package Behavioural_Design_Pattern.Strategy_Design_Pattern.Bad_code;

import Behavioural_Design_Pattern.Strategy_Design_Pattern.Bad_code.Concrete_Payment_Methods.*;

public class PaymentProcessor {
    public void processPayment(String paymentMethod)
    {
        if(paymentMethod.equals("credit"))
        {
            CreditCardPayment creditcard=new CreditCardPayment();
            creditcard.processPayment();
        }
        else if(paymentMethod.equals("Paypal"))
        {
            PayPalPayment paypal=new PayPalPayment();
            paypal.processPayment();
        }
        else if(paymentMethod.equals("cryto"))
        {
            CryptoPayment crypto= new CryptoPayment();
            crypto.processPayment();
        }

    }
}
