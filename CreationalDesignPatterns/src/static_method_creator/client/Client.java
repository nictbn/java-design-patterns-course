package static_method_creator.client;

import static_method_creator.factory.ShapeFactory;
import static_method_creator.product.Shape;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("square");
        shape3.draw();
    }
}
