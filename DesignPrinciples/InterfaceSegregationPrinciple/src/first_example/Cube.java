package first_example;

public class Cube implements Shape, ThreeDimensionalShape, ManageShape {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}
