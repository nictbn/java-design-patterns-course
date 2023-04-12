package example;

public class TV {
    private RemoteController state;

    public TV(RemoteController state) {
        this.state = state;
    }

    public RemoteController getState() {
        return state;
    }

    public void setState(RemoteController state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressSwitch(this);
    }
}
