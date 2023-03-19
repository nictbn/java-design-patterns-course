package abstract_creator.factory;

import abstract_creator.product.Shape;
import abstract_creator.product.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
