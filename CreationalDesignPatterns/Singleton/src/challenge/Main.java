package challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern Demo");
        System.out.println("Trying to make a captain for our team");
        CaptainMaker cm1 = CaptainMaker.getCaptain();
        System.out.println("Trying to make another captain for our team");
        CaptainMaker cm2 = CaptainMaker.getCaptain();
        if (cm1 == cm2) {
            System.out.println("There is only one captain!");
        }
    }
}
