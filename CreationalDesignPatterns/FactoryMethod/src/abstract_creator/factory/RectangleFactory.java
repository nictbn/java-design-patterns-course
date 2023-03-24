package abstract_creator.factory;

import abstract_creator.product.Rectangle;
import abstract_creator.product.Shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
