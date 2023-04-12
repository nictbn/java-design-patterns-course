package challenge;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        int result = context.executeStrategy(new Addition(), 10, 5);
        System.out.println("10 + 5 = " + result);

        result = context.executeStrategy(new Subtraction(), 10, 5);
        System.out.println("10 - 5 = " + result);

        result = context.executeStrategy(new Multiply(), 10, 5);
        System.out.println("10 * 5 = " + result);
    }
}
