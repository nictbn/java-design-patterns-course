package challenge;

import challenge.abstraction.Rectangle;
import challenge.abstraction.Shape;
import challenge.abstraction.Triangle;
import challenge.implementer.Color;
import challenge.implementer.GreenColor;
import challenge.implementer.RedColor;

public class Client {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern");

        System.out.println("\nColoring triangle:");
        Color green = new GreenColor();
        Shape triangle = new Triangle(green);
        triangle.drawShape(20);
        triangle.modifyBorder(20, 3);

        System.out.println("\nColoring rectangle:");
        Color red = new RedColor();
        Shape rectangle = new Rectangle(red);
        rectangle.drawShape(50);
        rectangle.modifyBorder(50, 2);
    }
}
