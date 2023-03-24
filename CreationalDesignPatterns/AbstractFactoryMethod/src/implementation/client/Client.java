package implementation.client;

import implementation.factory.AbstractFactory;
import implementation.factory.FactoryProducer;
import implementation.product.shape.Shape;
import implementation.product.colour.Colour;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

        AbstractFactory colourFactory = FactoryProducer.getFactory("colour");
        Colour color1 = colourFactory.getColour("red");
        color1.fill();
        Colour colour2 = colourFactory.getColour("green");
        colour2.fill();
        Colour colour3 = colourFactory.getColour("blue");
        colour3.fill();
    }
}
