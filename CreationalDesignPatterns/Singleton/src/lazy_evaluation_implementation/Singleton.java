package lazy_evaluation_implementation;

public class Singleton {
    private static Singleton uniqueInstance = null;

    private int someData = 0;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void setSomeData(int someData) {
        this.someData = someData;
    }

    public int getSomeData() {
        return someData;
    }
}
