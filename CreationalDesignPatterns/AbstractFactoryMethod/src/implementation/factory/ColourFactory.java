package implementation.factory;

import implementation.product.colour.Blue;
import implementation.product.colour.Colour;
import implementation.product.colour.Green;
import implementation.product.colour.Red;
import implementation.product.shape.Shape;

public class ColourFactory extends AbstractFactory {
    @Override
    public Colour getColour(String colourType) {
        if (colourType == null) {
            return null;
        }
        if ("RED".equalsIgnoreCase(colourType)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(colourType)) {
            return new Green();
        } else if ("BLUE".equalsIgnoreCase(colourType)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        // This violates the Interface Segregation Principle
        return null;
    }
}
