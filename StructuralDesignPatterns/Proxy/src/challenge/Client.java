package challenge;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("a-good-site.com");
            internet.connectTo("whateva.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
