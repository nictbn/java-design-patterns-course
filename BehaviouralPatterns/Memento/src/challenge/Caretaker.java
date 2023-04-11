package challenge;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
