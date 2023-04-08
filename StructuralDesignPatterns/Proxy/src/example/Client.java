package example;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("aFile.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
