package ASHISH_CODE_HIMSELF.Bank_Account_Practise;

public class TransactionService {
    private Long accountNumber;
    private String owner;
    private int balance;

    public TransactionService(Long accountNumber, String owner, int balance)
    {
        this.accountNumber=accountNumber;
        this.owner=owner;
        this.balance=balance;
    }

    public void addBalance(int amt)
    {
        balance+=amt;
    }

    public void withDraw(int amt)
    {
        if(FraudDetector(amt))
        {

        }
        balance-=amt;
        return amt;
    }

    public void transfer(Bank_Account a, int amtA, Bank_Account b)
    {
        a.balance()-=amtA;
        a.balance()+=amtA;
    }
}
