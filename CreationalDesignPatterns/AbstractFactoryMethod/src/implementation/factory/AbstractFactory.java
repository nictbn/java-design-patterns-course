package implementation.factory;

import implementation.product.colour.Colour;
import implementation.product.shape.Shape;

public abstract class AbstractFactory {
    public abstract Colour getColour(String colourType);
    public abstract Shape getShape(String shapeType);
}
