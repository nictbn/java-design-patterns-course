package challenge;

public class Client {
    public static void main(String[] args) {
        AuctionMediator mediator = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(mediator, "Linda");
        Buyer b2 = new AuctionBuyer(mediator, "Mike");
        Buyer b3 = new AuctionBuyer(mediator, "Jake");

        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);

        System.out.println("Welcome to the auction. We are selling a vacation");
        System.out.println("Waiting for the buyers' offers");
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);
        mediator.findHighestBidder();
        b2.cancelBid();
        System.out.println(b2.getName() + " has canceled the bid, in that case");
        mediator.findHighestBidder();
    }
}
