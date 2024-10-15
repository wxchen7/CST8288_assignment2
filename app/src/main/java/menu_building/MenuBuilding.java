package menu_building;

import menus.RestaurantMenu;

/**
 * Abstract class for building restaurant menus.
 * This class implements the Template Method pattern for menu creation.
 */

public abstract class MenuBuilding {

    protected abstract RestaurantMenu makeMenuBuilding(String season);

    /**
     * Template method for building a restaurant menu.
     * @param season The season for which to build the menu
     * @return A populated RestaurantMenu
     */

    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }

}