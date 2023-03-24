package challenge.client;

import challenge.factory.AnimalFactory;
import challenge.product.Animal;

public class Client {
    public static void main(String[] args) throws Exception {
        AnimalFactory factory = new AnimalFactory();

        Animal duck = factory.getAnimalType("duck");
        duck.speak();

        Animal tiger = factory.getAnimalType("tiger");
        tiger.speak();

        Animal lion = factory.getAnimalType("lion");
        lion.speak();
    }
}
