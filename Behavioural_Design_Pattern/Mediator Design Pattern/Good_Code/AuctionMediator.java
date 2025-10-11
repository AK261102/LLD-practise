package Behavioural_Design_Pattern.Mediator Design Pattern.Good_Code;

public interface AuctionMediator {
    void registerBidder(Bidder bd);
    void placeBid(Bidder bd,int amount);
}
