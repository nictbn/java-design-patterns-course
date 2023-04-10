package challenge;

public class Arts implements Subject {
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "French";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
