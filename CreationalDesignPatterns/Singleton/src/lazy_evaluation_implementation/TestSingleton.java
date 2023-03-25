package lazy_evaluation_implementation;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setSomeData(44);
        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getSomeData());

        s = null;
        s = Singleton.getInstance();
        System.out.println("Second reference: " + s);
        System.out.println("Singleton data value is: " + s.getSomeData());
    }
}
