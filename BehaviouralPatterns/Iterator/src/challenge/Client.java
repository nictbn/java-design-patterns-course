package challenge;

public class Client {
    public static void main(String[] args) {
        System.out.println("Iterator Pattern Challenge");
        Subject scienceSubjects = new Science();
        Subject artsSubjects = new Arts();

        Iterator scienceIterator = scienceSubjects.createIterator();
        Iterator artsIterator = artsSubjects.createIterator();

        System.out.println("\nScience subjects: ");
        print(scienceIterator);

        System.out.println("\nArts subjects");
        print(artsIterator);
    }

    public static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
