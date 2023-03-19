public class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }
}
