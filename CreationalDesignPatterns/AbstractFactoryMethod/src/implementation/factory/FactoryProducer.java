package implementation.factory;

public class FactoryProducer {

    public static final String SHAPE = "SHAPE";
    public static final String COLOUR = "COLOUR";

    public static AbstractFactory getFactory(String choice) {
        if (SHAPE.equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if (COLOUR.equalsIgnoreCase(choice)) {
            return new ColourFactory();
        }
        return null;
    }
}
