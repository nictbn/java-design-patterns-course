package challenge;

public class OnlineOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address");
    }

    @Override
    public void doPayment() {
        System.out.println("Online payment through netbanking, card or paypal");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item through the post office to delivery address");
    }
}
