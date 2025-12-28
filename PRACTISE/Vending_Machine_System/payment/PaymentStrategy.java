package PRACTISE.Vending_Machine_System.payment;

import PRACTISE.Vending_Machine_System.core.Coin;

public interface PaymentStrategy {
    
    boolean processPayment(double amount);
}


public class CoinPaymentStrategy implements PaymentStrategy{

    private List<coin>coins;
    public CoinPaymentStrategy(List<coin> coins)
    {
        this.coins = coins;
    }
    @Override
    public boolean processPayment(double amount)
    {
        int total=0;
        for(Coin coin: coins)
        {
            total+=coin.value;
        }

        if(total>=amount)
            return true;
        else
            return false;
    }
}
