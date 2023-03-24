package implementation.factory;

import implementation.product.colour.Colour;
import implementation.product.shape.Circle;
import implementation.product.shape.Rectangle;
import implementation.product.shape.Shape;
import implementation.product.shape.Square;

public class ShapeFactory extends AbstractFactory{

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    @Override
    public Colour getColour(String colourType) {
        // This violates the Interface Segregation Principle
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (CIRCLE.equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if (RECTANGLE.equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if (SQUARE.equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
