package example;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Mariah");
        User user2 = new UserImpl(mediator, "John");
        User user3 = new UserImpl(mediator, "George");
        User user4 = new UserImpl(mediator, "Jane");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi folks!");
        user2.send("That's all folks!");
    }
}
