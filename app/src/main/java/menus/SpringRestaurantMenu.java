package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * Concrete class representing a Spring restaurant menu.
 * This class extends RestaurantMenu and uses a RestaurantMenuFactory to populate its items.
 */

public class SpringRestaurantMenu extends RestaurantMenu {

    private final RestaurantMenuFactory factory;

    /**
     * Constructor for SpringRestaurantMenu.
     * @param factory The factory used to create menu items
     */

    public SpringRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
        setName("Spring Menu");
        setPeriod("March 1 to May 31.");
    }

    @Override
    public void populateMenu() {
        // Use the factory to create and populate menu items
        entrees = factory.createEntrees();
        mainCourses = factory.createMainCourses();
        desserts = factory.createDesserts();
        drinks = factory.createDrinks();
    }
}