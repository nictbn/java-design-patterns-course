package challenge;

public class Ford extends BasicCar implements Cloneable {
    public Ford(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public Ford clone() {
        return (Ford) super.clone();
    }
}
