package challenge;

public abstract class Buyer {
    protected Mediator mediator;
    protected String name;
    protected int bid;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBid() {
        return bid;
    }

    public abstract void bid(int price);
    public abstract void cancelBid();
    public abstract void endAuction();
}
