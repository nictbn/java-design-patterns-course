package abstract_creator.factory;

import abstract_creator.product.Shape;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}
