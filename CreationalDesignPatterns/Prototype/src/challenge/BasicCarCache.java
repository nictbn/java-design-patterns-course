package challenge;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> basicCarMap = new Hashtable<>();

    public static BasicCar getCar(String carName) throws CloneNotSupportedException {
        BasicCar cachedBasicCar = basicCarMap.get(carName);
        return (BasicCar) cachedBasicCar.clone();
    }

    public static void loadCache() {
        BasicCar nanoBase = new Nano("Green Nano");
        nanoBase.price = 100000;
        basicCarMap.put("Green Nano", nanoBase);

        BasicCar fordBase = new Ford("Ford Yellow");
        fordBase.price = 500000;
        basicCarMap.put("Ford Yellow", fordBase);
    }
}
