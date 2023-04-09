package example;

public class Client {
    public InterpreterContext ic;

    public Client(InterpreterContext ic) {
        this.ic = ic;
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());
        System.out.println(str1 + " = " + client.interpret(str1));
        System.out.println(str2 + " = " + client.interpret(str2));
    }

    public String interpret(String str) {
        Expression expression = null;
        int i = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if (str.contains("Hexadecimal")) {
            expression = new IntToHexExpression(i);
        } else if (str.contains("Binary")) {
            expression = new IntToBinaryExpression(i);
        } else {
            return str;
        }
        return expression.interpret(ic);
    }
}
