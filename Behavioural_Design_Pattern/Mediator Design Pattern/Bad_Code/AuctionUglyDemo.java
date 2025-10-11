package Behavioural_Design_Pattern.Mediator Design Pattern.Bad_Code;

public class AuctionUglyDemo {
    Bidder b1=new Bidder("Ashish");
    Bidder b2=new Bidder("Sachin");
    Bidder b3=new Bidder("Ayush");

    Bidder[] bidders ={b1,b2,b3};
    b1.placeBidWithExtras("Ashish",120);
    b2.placeBidWithExtras("Sachin",150);
    b3.placeBidWithExtras("Ayush",39);

    /*
     * Problem with this approach
     * Each time i have to create new bidders without having any main centralised mechanism
     * bidder is responsible for managing the bids
     */
}
