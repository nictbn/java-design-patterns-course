package first_example;

public class ConcreteDecorator2 extends Decorator {
    @Override
    public void doJob() {
        System.out.println("***Start Decorator 2***");
        super.doJob();
        System.out.println("Explicitly from Decorator 2");
        System.out.println("***End Decorator 2***");
    }
}
