package challenge;

import java.util.LinkedList;

public class Science implements Subject {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Math");
        subjects.addLast("Computer Science");
        subjects.addLast("Physics");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
