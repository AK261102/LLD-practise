package ASHISH_CODE_HIMSELF.Bank_Account_Practise;

public class StatementGenerator {
    
    private Long accountNumber;
    public StatementGenerator(Long accountNumber)
    {
        this.accountNumber=accountNumber;
    }

    public void getStatement(Bank_Account a)
    {
        System.out.println(a.balance());
    }
}
