package challenge;

public class Client {
    public static void main(String[] args) {
        OrderProcessTemplate orderProcessor = new OnlineOrder();
        orderProcessor.processOrder(true);
        System.out.println();
        orderProcessor = new StoreOrder();
        orderProcessor.processOrder(true);
    }
}
