package challenge;

import challenge.menu.Both;
import challenge.menu.NonVegMenu;
import challenge.menu.VegMenu;
import challenge.restaurant.NonVegRestaurant;
import challenge.restaurant.VegNonBothRestaurant;
import challenge.restaurant.VegRestaurant;

public class HotelKeeper {
    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu) vegRestaurant.getMenus();
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) nonVegRestaurant.getMenus();
    }

    public Both getVegAndNonVegMenu() {
        VegNonBothRestaurant vegNonBothRestaurant = new VegNonBothRestaurant();
        return (Both) vegNonBothRestaurant.getMenus();
    }
}
