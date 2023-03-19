package first_example;

public class Square implements Shape, ManageShape {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}
