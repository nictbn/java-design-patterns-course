package example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Template Method Pattern");
        HouseTemplate house = new WoodenHouse();
        house.buildHouse();
        System.out.println("**********************");
        house = new GlassHouse();
        house.buildHouse();
    }
}
