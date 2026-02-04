package designpatterns.behaviour.mediator;

public class ExtendedAuctionHouse extends AuctionHouse {

    private long biddingendTime;
    public ExtendedAuctionHouse(long biddingendTime) {
        this.biddingendTime = biddingendTime;
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        if(System.currentTimeMillis()>biddingendTime){
            System.out.println("Invalid Bid");
            return;
        }
        System.out.println("LOG: "+bidder.getName()+" is bidding "+amount+" at "+biddingendTime);
        super.placeBid(bidder,amount);
    }
}
