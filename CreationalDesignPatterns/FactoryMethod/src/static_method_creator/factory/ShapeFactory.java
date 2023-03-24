package static_method_creator.factory;

import static_method_creator.product.Circle;
import static_method_creator.product.Rectangle;
import static_method_creator.product.Shape;
import static_method_creator.product.Square;

public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";

    public static Shape getShape(String shapeType) {
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
