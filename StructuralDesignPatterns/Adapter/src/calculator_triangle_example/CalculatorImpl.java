package calculator_triangle_example;

public class CalculatorImpl implements Calculator {
    Rectangle rectangle;
    @Override
    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.length * rectangle.width;
    }
}
