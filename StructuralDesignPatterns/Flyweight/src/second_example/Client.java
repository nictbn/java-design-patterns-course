package second_example;

import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Second Flyweight Pattern Example\n");

        RobotFactory factory = new RobotFactory();
        RobotImpl aConcreteRobot;

        for (int i = 0; i < 3; i++) {
            aConcreteRobot = (RobotImpl) factory.getRobot("king");
            aConcreteRobot.setColor(getRandomColor());
            aConcreteRobot.print();
        }

        for (int i = 0; i < 3; i++) {
            aConcreteRobot = (RobotImpl) factory.getRobot("queen");
            aConcreteRobot.setColor(getRandomColor());
            aConcreteRobot.print();
        }

        int numberOfDistinctRobots = factory.getTotalObjectsCreated();
        System.out.println("Distinct Robot objects created till now: " + numberOfDistinctRobots);
    }

    public static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        }
        return "green";
    }
}
