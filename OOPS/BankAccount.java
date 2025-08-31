class Bank{
    private String accountNumber;
    private double balance;

    public Bank(String accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0)
        {balance+=amount;
        System.out.println("desposited="+amount);}
        else{
            System.out.println("Invalid desposit amount");
        }
    }
// when u are working on the ease of maintainance of the code, u can combine thos desposit and withdrawn function into one and this 
// this function should be like updateAmount(double amount ,bool isDeposit);
// and can easily can add transaction fee features
    public void withdraw(double amount){
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdrawn amount:"+ amount);

        }
        else
        {
            System.out.println("Sachi pasisa");
        }
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Bank b1=new Bank("12345",1000.0);
        System.out.println(b1.getAccountNumber());
        System.out.println(b1.getBalance());
        b1.deposit(50000.0);
        System.out.println("Updated balance="+b1.getBalance());
        b1.withdraw(2000.0);
        System.out.println(b1.getBalance());
    }
}
