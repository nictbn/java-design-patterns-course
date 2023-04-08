package challenge;

import java.util.HashMap;
import java.util.Hashtable;

public class PlayerFactory {
    public static final String TERRORIST = "terrorist";
    public static final String COUNTER_TERRORIST = "Counter-Terrorist";
    private static HashMap<String, Player> hashMap = new HashMap<>();

    public static Player getPlayer(String type) {
        Player p = null;
        if (hashMap.containsKey(type)) {
            p = hashMap.get(type);
        } else if(TERRORIST.equalsIgnoreCase(type)) {
            System.out.println("Terrorist Created");
            p = new Terrorist();
            hashMap.put(TERRORIST, p);
        } else if (COUNTER_TERRORIST.equalsIgnoreCase(type)) {
            System.out.println("Counter-Terrorist Created");
            p = new CounterTerrorist();
            hashMap.put(COUNTER_TERRORIST, p);
        } else {
            System.out.println("Could not get player type");
        }
        return p;
    }
}
