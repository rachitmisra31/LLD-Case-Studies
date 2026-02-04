package designpatterns.behaviour.mediator;

public class BiddingSystemClient {

    public static void main(String[] args) {
        long biddingEndTime = System.currentTimeMillis() + 5000;
        AuctionMediator auctionMediator = new ExtendedAuctionHouse(biddingEndTime);
        Bidder bidder1 = new Bidder("Rachit", auctionMediator);
        Bidder bidder2 = new Bidder("Prakash", auctionMediator);
        Bidder bidder3 = new Bidder("Manoj", auctionMediator);

        auctionMediator.registerBidder(bidder1);
        auctionMediator.registerBidder(bidder2);
        auctionMediator.registerBidder(bidder3);

        auctionMediator.placeBid(bidder1,5000);
    }
}
