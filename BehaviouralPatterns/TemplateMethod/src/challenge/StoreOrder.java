package challenge;

public class StoreOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("Customer chooses the item from the shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Pays at the counter through cash / POS");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to in delivery counter");
    }
}
