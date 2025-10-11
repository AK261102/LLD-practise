package Behavioural_Design_Pattern.Mediator Design Pattern.Good_Code;

public class AuctionMedaitorDemo {
    public static void main(String[] args) {
        AuctionMediator mananger=new AuctionHouse();
        Bidder b1=new Bidder("Alice",mananger);
        Biddler b2=new Bidder("Bob",mananger);
        mananger.registerBidder(b1);
        mananger.registerBidder(b2);
        b1.placeBid(200);
        b2.placeBid(100);

    }
}
