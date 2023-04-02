package first_example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Decorator pattern Demo");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecorator1 decorator1 = new ConcreteDecorator1();
        ConcreteDecorator2 decorator2 = new ConcreteDecorator2();

        decorator1.setComponent(cc);
        decorator1.doJob();

        decorator2.setComponent(decorator1);
        decorator2.doJob();
    }
}
