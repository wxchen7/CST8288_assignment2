package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * Concrete class representing a Fall restaurant menu.
 * This class extends RestaurantMenu and uses a RestaurantMenuFactory to populate its items.
 */

public class FallRestaurantMenu extends RestaurantMenu {

    private final RestaurantMenuFactory factory;

    /**
     * Constructor for FallRestaurantMenu.
     * @param factory The factory used to create menu items
     */

    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
        setName("Fall Menu");
        setPeriod("September 1 to November 30.");
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