package example;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);
        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PayPalStrategy("test@Email.com", "aPassword"));
        cart.pay(new CreditCardStrategy("JOHN DOE", "1234 5555 6666 7777", "123", "05/05/2025"));
    }
}
