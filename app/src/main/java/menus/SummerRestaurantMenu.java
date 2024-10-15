package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * Concrete class representing a Summer restaurant menu.
 * This class extends RestaurantMenu and uses a RestaurantMenuFactory to populate its items.
 */

public class SummerRestaurantMenu extends RestaurantMenu {

    private final RestaurantMenuFactory factory;

    /**
     * Constructor for SummerRestaurantMenu.
     * @param factory The factory used to create menu items
     */

    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
        setName("Summer Menu");
        setPeriod("June 1 to August 31.");
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