package challenge.factory;

import challenge.product.Animal;
import challenge.product.Duck;
import challenge.product.Tiger;

public class AnimalFactory {

    public static final String DUCK = "DUCK";
    public static final String TIGER = "TIGER";

    public Animal getAnimalType(String type) throws Exception {
        if (DUCK.equalsIgnoreCase(type)) {
            return new Duck();
        } else if (TIGER.equalsIgnoreCase(type)) {
            return new Tiger();
        }
        throw new Exception("Unsupported animal type!");
    }
}
