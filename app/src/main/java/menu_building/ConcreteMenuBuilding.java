package menu_building;

import menu_factory.*;
import menus.*;

/**
 * Concrete implementation of a restaurant menu builder.
 * This class extends MenuBuilding and uses different RestaurantMenuFactory
 * instances to create menus based on the specified season.
 */

public class ConcreteMenuBuilding extends MenuBuilding {

    /**
     * Creates a RestaurantMenu based on the given season.
     *
     * @param season The season for which to create the menu.
     * @return A RestaurantMenu instance corresponding to the specified season,
     *         or null if an invalid season is provided.
     */
    
    @Override
    protected RestaurantMenu makeMenuBuilding(String season) {
        RestaurantMenu theMenu = null;
        
        // Create menu based on the season
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
