interface  Payment {

    void pay();
}

class creditSePlayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying using credit card");
    }
}

class cashSePlayment implements Payment{
    @Override
    public void pay()
    {
        System.err.println("Paying using cash");
    }
}
public class Real{
    public static void main(String[] args)
    {
        Payment p1=new creditSePlayment();
        Payment p2=new cashSePlayment();
        p1.pay();
        p2.pay();
    }
}