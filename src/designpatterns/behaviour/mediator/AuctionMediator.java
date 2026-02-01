package designpatterns.behaviour.mediator;

public interface AuctionMediator {

    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder, int amount);
}
