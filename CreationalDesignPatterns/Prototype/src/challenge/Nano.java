package challenge;

public class Nano extends BasicCar implements Cloneable {
    public Nano(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public Nano clone() {
        return (Nano) super.clone();
    }
}
