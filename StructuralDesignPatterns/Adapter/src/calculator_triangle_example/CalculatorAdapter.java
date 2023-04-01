package calculator_triangle_example;

public class CalculatorAdapter implements Calculator {
    CalculatorImpl calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new CalculatorImpl();
        Rectangle newRectangle = new Rectangle();
        newRectangle.length = triangle.base;
        newRectangle.width = 0.5 * triangle.height;
        return calculator.getArea(newRectangle);
    }
}
