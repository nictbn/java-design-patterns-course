package challenge.restaurant;

import challenge.Hotel;
import challenge.menu.Menus;
import challenge.menu.VegMenu;

public class VegRestaurant implements Hotel {
    public Menus getMenus() {
        VegMenu v = new VegMenu();
        return v;
    }
}
