package PRACTISE.Parking_Alot.paymentStrategy;

public class cashPayment implements payment{
    @Override
    public boolean processPayment(double amount){
        return true;
    }
}
