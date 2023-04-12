package example;

public class Off extends RemoteController {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am off. going to be on now.");
        context.setState(new On());
    }
}
