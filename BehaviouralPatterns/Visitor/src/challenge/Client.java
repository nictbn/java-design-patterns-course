package challenge;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static List<Visitable> items = new ArrayList<>();
    public static void main(String[] args) {
        Visitable myBook = new Book(8.52, 1.05);
        Visitable myCD = new CD(18.52, 3.05);
        Visitable myDVD = new DVD(6.53, 4.02);

        items.add(myBook);
        items.add(myCD);
        items.add(myDVD);

        Visitor visitor = new USPostageVisitor();
        double myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items shipped to the US is: " + myPostage);

        visitor = new SouthAmericaPostageVisitor();
        myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items shipped to South America is: " + myPostage);
    }

    public static double calculatePostage(Visitor visitor) {
        for (Visitable item : items) {
            item.accept(visitor);
        }
        return visitor.getTotalPostage();
    }
}
