package example;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Producer(), new Assembler());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Producer(), new Assembler());
        vehicle2.manufacture();
    }
}
