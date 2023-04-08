package second_example;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    public static final String KING_ROBOT = "king";
    public static final String QUEEN_ROBOT = "queen";
    Map<String, Robot> types = new HashMap<>();

    public int getTotalObjectsCreated() {
        return types.size();
    }

    public Robot getRobot(String robotType) throws Exception {
        Robot robot = null;
        if (types.containsKey(robotType)) {
            robot = types.get(robotType);
        } else if (KING_ROBOT.equalsIgnoreCase(robotType)) {
            System.out.println("We do not have a king robot, so we are creating one");
            robot = new RobotImpl(KING_ROBOT);
            types.put(KING_ROBOT, robot);
        } else if (QUEEN_ROBOT.equalsIgnoreCase(robotType)) {
            System.out.println("We do not have a queen robot so we are creating one");
            robot = new RobotImpl(QUEEN_ROBOT);
            types.put(QUEEN_ROBOT, robot);
        } else {
            throw new Exception("Robot factory can create only king or queen robots");
        }
        return robot;
    }
}
