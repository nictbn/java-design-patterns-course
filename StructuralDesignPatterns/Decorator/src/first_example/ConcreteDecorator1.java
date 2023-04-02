package first_example;

public class ConcreteDecorator1 extends Decorator {
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("I am explicitly from the first decorator");
    }
}
