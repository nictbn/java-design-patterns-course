package challenge;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    private List<Buyer> buyers;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.getName() + " was added to the buyers list");
    }

    @Override
    public void findHighestBidder() {
        int highestBid = 0;
        Buyer winner = null;
        for (Buyer buyer : buyers) {
            if (buyer.getBid() > highestBid) {
                highestBid = buyer.getBid();
                winner = buyer;
            }
        }
        System.out.println("The auction winner is " + winner.getName() + ". They paid $" + winner.getBid() + " for the item");
        for (Buyer buyer : buyers) {
            buyer.endAuction();
        }
    }
}
