package PRACTISE.Car_Rental_System.payment;

class CashPayment implements Paymentstrategy{
    @Override
    public boolean processPayment(double amount)
    {
        return true;
    }
}

class UpiPayment implements Paymentstrategy
{
    private String upiD;

    public UpiPayment(String upiD)
    {
        this.upiD=upiD;
    }

    @Override
    public boolean processPayment(double amount)
    {
        return true;
    }

}
