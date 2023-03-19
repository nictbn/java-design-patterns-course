public class Client {
    private final Service myService;
    public Client(Service service) {
        myService = service;
    }

    public void doSomething() {
        myService.write("This is a message");
    }
}
