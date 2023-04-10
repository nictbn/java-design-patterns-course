package challenge;

public class AuctionBuyer extends Buyer {

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.bid = price;
    }

    @Override
    public void cancelBid() {
        this.bid = -1;
    }

    @Override
    public void endAuction() {
        System.out.println(name + " received the message that the auction is over.");
    }
}
