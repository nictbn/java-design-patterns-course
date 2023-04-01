package challenge.abstraction;

import challenge.implementer.Color;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void drawShape(int border) {
        System.out.println("This triangle is colored with");
        color.fillWithColor(border);
    }

    @Override
    public void modifyBorder(int border, int multiplier) {
        System.out.println("\nWe are changing the border length of the triangle " + multiplier + " times");
        border = border * multiplier;
        drawShape(border);
    }
}
