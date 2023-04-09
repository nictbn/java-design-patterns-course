package challenge.client;

import challenge.command.BuyStock;
import challenge.command.SellStock;
import challenge.invoker.Broker;
import challenge.receiver.Stock;

public class Client {
    public static void main(String[] args) {
        Stock googleStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(googleStock);
        SellStock sellStockOrder = new SellStock(googleStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
