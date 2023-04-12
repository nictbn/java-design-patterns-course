package challenge;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() {
        currentState = new Vibration();
    }

    public void setCurrentState(MobileAlertState currentState) {
        this.currentState = currentState;
    }

    public void alert() {
        currentState.alert();
    }
}
