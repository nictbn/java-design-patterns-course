package example;

public class On extends RemoteController {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already on. Going to be off now");
        context.setState(new Off());
    }
}
