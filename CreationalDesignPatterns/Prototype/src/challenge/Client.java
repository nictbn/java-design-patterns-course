package challenge;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Prototype Challenge");
        BasicCarCache.loadCache();

        BasicCar bc1 = BasicCarCache.getCar("Green Nano");
        bc1.price = bc1.price + BasicCar.getRandomPrice();
        System.out.println("Car is: " + bc1.modelName + " and its price is $" + bc1.price);

        bc1 = BasicCarCache.getCar("Ford Yellow");
        bc1.price = bc1.price + BasicCar.getRandomPrice();
        System.out.println("Car is: " + bc1.modelName + " and its price is $" + bc1.price);
    }
}
