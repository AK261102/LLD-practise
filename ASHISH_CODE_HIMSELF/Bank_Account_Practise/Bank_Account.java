package ASHISH_CODE_HIMSELF.Bank_Account_Practise;

public class Bank_Account {
    private int balance;
    private Long accountNumber;
    private String owner;

    public Bank_Account(int balance,Long accountNumber,String owner)
    {
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.owner=owner;
    }

    public int balance()
    {
        return balance;
    }
    
}
