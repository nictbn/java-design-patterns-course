package first_example;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("First Flyweight Pattern example\n");

        RobotFactory factory = new RobotFactory();
        Robot robot = factory.getRobot("small");
        robot.print();

        for (int i = 0; i < 2; i++) {
            robot = factory.getRobot("small");
            robot.print();
        }

        int numberOfDistinctRobots = factory.getTotalObjectsCreated();
        System.out.println("Distinct Robot objects created till now: " + numberOfDistinctRobots);

        for (int i = 0; i < 2; i++) {
            robot = factory.getRobot("large");
            robot.print();
        }

        numberOfDistinctRobots = factory.getTotalObjectsCreated();
        System.out.println("Distinct Robot objects created till now: " + numberOfDistinctRobots);
    }
}
