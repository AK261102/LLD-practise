package Behavioural_Design_Pattern.Mediator Design Pattern.Bad_Code;

public class Bidder {
    String name;
    int bid;
    public Bidder(String name)
    {
        this.name=name;
    }

    public void placeBidWithExtras(int amount,Bidder[] bidders)
    {
        this.bid=amount;

        for(Bidder bd:bidders)
        {
            if(b!=this)
            {
                bd.receiveBidWithExtras(bd, amount);
            }
        }
    }

    public void receiveBidWithExtras(String name,int bid)
    {
        System.out.println("The name of bidder is "+name+" THis is the amount he bidded for "+bid);
    }
}
