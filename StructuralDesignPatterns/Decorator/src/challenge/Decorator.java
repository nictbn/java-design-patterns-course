package challenge;

public abstract class Decorator implements Shape {
    protected Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
