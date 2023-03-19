package concrete_creator.factory;

import concrete_creator.product.Circle;
import concrete_creator.product.Rectangle;
import concrete_creator.product.Shape;
import concrete_creator.product.Square;

public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase(CIRCLE)) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase(RECTANGLE)) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase(SQUARE)) {
            return new Square();
        }
        return null;
    }
}
