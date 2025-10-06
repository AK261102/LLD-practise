package Behavioural_Design_Pattern.Strategy_Design_Pattern.Good_code;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    // dekho ye kaise refer kar raha hai payment strategy ko

//   private PaymentStrategy 
//   paymentStrategy; is a reference
//    variable that holds an object
//   of any class that implements
//   the PaymentStrategy interface.
//   This is the core of the
//   Strategy pattern - instead of
//   hard-coding a specific payment
//   type, you're using an interface
//    reference that can hold ANY
//   payment implementation.

    public PaymentProcessor(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }

    //process payment using the current strategy
    public void processPayment(){
        paymentStrategy.processPayment();
    }
    // now i want to dynamically change the payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }
}
