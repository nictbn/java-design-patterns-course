package example;

public class Fruit implements ItemElement {
    private int pricePerKh;
    private int weight;
    private String name;

    public Fruit(int pricePerKh, int weight, String name) {
        this.pricePerKh = pricePerKh;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKh() {
        return pricePerKh;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
