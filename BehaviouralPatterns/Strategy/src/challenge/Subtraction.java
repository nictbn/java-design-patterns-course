package challenge;

public class Subtraction implements Strategy{
    @Override
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
}
