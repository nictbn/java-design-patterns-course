package challenge.restaurant;

import challenge.Hotel;
import challenge.menu.Both;
import challenge.menu.Menus;

public class VegNonBothRestaurant implements Hotel {
    public Menus getMenus() {
        Both b = new Both();
        return b;
    }
}