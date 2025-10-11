package Behavioural_Design_Pattern.Mediator Design Pattern.Good_Code.Core_Classes;

public class Bidder {
    private String name;
    private AuctionMediator auctionMonitor;
    public Bidder(String name,AuctionMediator auctionMonitor)
    {
        this.name=name;
        this.auctionMonitor=auctionMonitor;
    }

    public String getName(){
        return name;
    }
    // check this logic
    public int placeBid(int amount ,AuctionMediator auctionMonitor)
    {
        auctionMonitor.placeBid(this,amount);
    }
    public void receiveNotificationWhilePlacing(String name,int amount)
    {
        System.out.println("this is the bid placed "+name+ "and the amount this"+ amount);
    }
}
