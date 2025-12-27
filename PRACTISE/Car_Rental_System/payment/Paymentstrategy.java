package PRACTISE.Car_Rental_System.payment;

public interface Paymentstrategy {
    boolean processPayment(double amount);

    String getPaymentMethod();
}
