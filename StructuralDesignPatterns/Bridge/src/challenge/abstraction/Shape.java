package challenge.abstraction;

import challenge.implementer.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void drawShape(int border);
    public abstract void modifyBorder(int border, int multiplier);
}
