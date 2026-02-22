package ASHISH_CODE_HIMSELF.Bank_Account_Practise;

public class FraudDetector {
     
    private Long account_Number;
    private int amt;
    private String owner;
    Bank_Account a;
    public void FraudDetector(Bank_Account a, int amt)
    {
        this.a=a;
        this.amt=amt;
    }

    void checkFraud(Bank_Account a, int amt)
    {
        int current_balance= a.balance()-amt;
        if(a<0)
        {
            //fraud
        }
        else
        {
            //safe
        }
    }
}
