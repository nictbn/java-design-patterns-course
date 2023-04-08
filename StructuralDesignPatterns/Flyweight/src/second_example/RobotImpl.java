package second_example;

public class RobotImpl implements Robot {
    String robotType;
    // The color should not normally be in the base robot; this is just for demonstration purposes
    String color;

    public RobotImpl(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + color + " color");
    }
}
