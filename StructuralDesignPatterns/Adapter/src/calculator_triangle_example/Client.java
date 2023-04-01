package calculator_triangle_example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Adapter Pattern Demo");
        Triangle t = new Triangle(20, 10);
        Calculator calculatorAdapter = new CalculatorAdapter(t);
        System.out.println("Area of the triangle is: " + calculatorAdapter.getArea(null));
    }
}
