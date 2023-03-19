public class Main {
    public static void main(String[] args) { // This acts as the injector
        Service service = new ServiceA();
        Client client = new Client(service);
        client.doSomething();
    }
}
