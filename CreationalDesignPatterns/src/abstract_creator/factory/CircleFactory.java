package abstract_creator.factory;

import abstract_creator.product.Circle;
import abstract_creator.product.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
