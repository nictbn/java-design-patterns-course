package example;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public Topic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null Observer");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        List<Observer> localObservers = null;
        if (!changed) {
            return;
        }
        localObservers = new ArrayList<>(this.observers);
        this.changed = false;

        for (Observer observer : localObservers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
