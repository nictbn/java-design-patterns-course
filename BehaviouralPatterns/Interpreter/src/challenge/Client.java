package challenge;

public class Client {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedExpression();

        Context ic1 = new Context("John");
        System.out.println("Is John male? " + isMale.interpret(ic1));

        Context ic2 = new Context("Married Julie");
        System.out.println("Is Julie married? " + isMarried.interpret(ic2));

        Context ic3 = new Context("Lucy");
        System.out.println("Is Lucy married? " + isMarried.interpret(ic3));
    }

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

}
