package challenge.product;

import challenge.item.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public BigDecimal getCost() {
        BigDecimal cost = new BigDecimal(0);
        for (Item item : items) {
            cost = cost.add(item.price());
        }
        return cost;
    }

    public void showItems() {
        for (Item item: items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.print(", Price: " + item.price() + "\n");
        }
    }
}
