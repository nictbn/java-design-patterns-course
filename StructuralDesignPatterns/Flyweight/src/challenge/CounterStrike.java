package challenge;

import java.util.Random;

import static challenge.PlayerFactory.COUNTER_TERRORIST;
import static challenge.PlayerFactory.TERRORIST;

public class CounterStrike {
    private static String[] playerType = {TERRORIST, COUNTER_TERRORIST};
    private static String[] weapons = {"AK-47", "Maverick", "Desert Eagle"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player p = PlayerFactory.getPlayer(getRandomPlayerType());
            p.assignWeapon(getRandomWeapon());
            p.mission();
        }
    }

    private static String getRandomWeapon() {
        Random r = new Random();
        int randomInt = r.nextInt(weapons.length);
        return weapons[randomInt];
    }

    private static String getRandomPlayerType() {
        Random r = new Random();
        int randomInt = r.nextInt(playerType.length);
        return playerType[randomInt];
    }


}
