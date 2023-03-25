package double_checked_locking_implementation;

public class Singleton {
    private volatile static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton() {}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
