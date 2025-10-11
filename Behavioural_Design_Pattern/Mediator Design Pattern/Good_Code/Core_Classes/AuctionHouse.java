package Behavioural_Design_Pattern.Mediator

import java.util.ArrayList;
import java.util.List;

Design Pattern.Good_Code.Core_Classes;

public class AuctionHouse implements AuctionMediator {
    public List<Bidder> bidders=new ArrayList<>();

    @Override
    public void registerBidder(Bidder bidder)
    {
        bidders.add(bidder);
    }
    @Override
    public void placeBid(Bidder bidder,int amount)
    {
        for(Bidder b:bidders)
        {
            // b!=bidder
            b.receiveBidWithExtras(bidder,amount)
        }
    }
}
