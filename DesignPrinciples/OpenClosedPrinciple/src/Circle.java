public class Circle implements Shape {
    public double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
