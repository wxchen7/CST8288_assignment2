package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * Concrete class representing a Winter restaurant menu.
 * This class extends RestaurantMenu and uses a RestaurantMenuFactory to populate its items.
 */

public class WinterRestaurantMenu extends RestaurantMenu {

    private final RestaurantMenuFactory factory;

    /**
     * Constructor for SummerRestaurantMenu.
     * @param factory The factory used to create menu items
     */

    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
        setName("Winter Menu");
        setPeriod("December 1 to February 28.");
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