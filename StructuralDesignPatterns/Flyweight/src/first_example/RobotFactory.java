package first_example;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    public static final String SMALL_ROBOT = "small";
    public static final String LARGE_ROBOT = "large";
    Map<String, Robot> types = new HashMap<>();

    public int getTotalObjectsCreated() {
        return types.size();
    }

    public Robot getRobot(String robotType) throws Exception {
        Robot robot = null;
        if (types.containsKey(robotType)) {
            robot = types.get(robotType);
        } else if (SMALL_ROBOT.equalsIgnoreCase(robotType)) {
            System.out.println("We do not have a small robot, so we are creating one");
            robot = new SmallRobot();
            types.put(SMALL_ROBOT, robot);
        } else if (LARGE_ROBOT.equalsIgnoreCase(robotType)) {
            System.out.println("We do not have a large robot so we are creating one");
            robot = new LargeRobot();
            types.put(LARGE_ROBOT, robot);
        } else {
            throw new Exception("Robot factory can create only small or large robots");
        }
        return robot;
    }
}
