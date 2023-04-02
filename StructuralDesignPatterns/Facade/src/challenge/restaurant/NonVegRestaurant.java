package challenge.restaurant;

import challenge.Hotel;
import challenge.menu.Menus;
import challenge.menu.NonVegMenu;

public class NonVegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}