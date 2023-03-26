package challenge;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    public String modelName;
    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static int getRandomPrice() {
        int price = 0;
        Random r = new Random();
        price = r.nextInt(100000);
        return price;
    }

    public BasicCar clone() {
        BasicCar clone = null;
        try {
            clone = (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
