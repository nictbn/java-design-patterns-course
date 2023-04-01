package challenge.abstraction;

import challenge.implementer.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void drawShape(int border) {
        System.out.println("This Rectangle is colored with");
        color.fillWithColor(border);
    }

    @Override
    public void modifyBorder(int border, int multiplier) {
        System.out.println("\nWe are changing the border length of the rectangle " + multiplier + " times");
        border = border * multiplier;
        drawShape(border);
    }
}
