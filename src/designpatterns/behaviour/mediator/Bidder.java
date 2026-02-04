package designpatterns.behaviour.mediator;

public class Bidder {
    String name;
    AuctionMediator mediator;
    public Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void recieveBid(Bidder bidder, int amount) {
        System.out.println(name+" is notified: " + bidder.getName()+" placed a bid of " + amount);
    }
}