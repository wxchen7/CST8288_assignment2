package menu_building;

import menus.RestaurantMenu;

public abstract class MenuBuilding {

    protected abstract RestaurantMenu makeMenuBuilding(String season);

    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }

}