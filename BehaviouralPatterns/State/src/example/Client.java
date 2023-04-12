package example;

public class Client {
    public static void main(String[] args) {
        System.out.println("State Design Pattern");
        Off initialState = new Off();
        TV tv = new TV(initialState);

        tv.pressButton();
        tv.pressButton();
    }
}
