package menu_building;

import menu_factory.*;
import menus.*;

public class ConcreteMenuBuilding extends MenuBuilding {

    @Override
    protected RestaurantMenu makeMenuBuilding(String season) {
        RestaurantMenu theMenu = null;
        if ("Fall".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new FallRestaurantMenuFactory();
            theMenu = new FallRestaurantMenu(theFactory);
            theMenu.setName("Fall Menu");
            theMenu.setPeriod("September 1 to November 30.");
        } else if ("Winter".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new WinterRestaurantMenuFactory();
            theMenu = new WinterRestaurantMenu(theFactory);
            theMenu.setName("Winter Menu");
            theMenu.setPeriod("December 1 to February 28.");
        } else if ("Spring".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SpringRestaurantMenuFactory();
            theMenu = new SpringRestaurantMenu(theFactory);
            theMenu.setName("Spring Menu");
            theMenu.setPeriod("March 1 to May 30.");
        } else if ("Summer".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SummerRestaurantMenuFactory();
            theMenu = new SummerRestaurantMenu(theFactory);
            theMenu.setName("Summer Menu");
            theMenu.setPeriod("June 1 to August 31");
        }
        return theMenu;
    }

}
