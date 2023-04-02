package challenge;

import challenge.menu.Both;
import challenge.menu.NonVegMenu;
import challenge.menu.VegMenu;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();
        VegMenu vegMenu = keeper.getVegMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();
        Both bothMenus = keeper.getVegAndNonVegMenu();
    }
}
