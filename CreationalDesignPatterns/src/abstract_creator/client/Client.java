package abstract_creator.client;

import abstract_creator.factory.CircleFactory;
import abstract_creator.factory.RectangleFactory;
import abstract_creator.factory.SquareFactory;
import abstract_creator.product.Shape;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();
    }
}
