package menus;

import menu_factory.RestaurantMenuFactory;

public class SpringRestaurantMenu extends RestaurantMenu {

    private final RestaurantMenuFactory factory;

    public SpringRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
        setName("Spring Menu");
        setPeriod("March 1 to May 31.");
    }

    @Override
    public void populateMenu() {
        entrees = factory.createEntrees();
        mainCourses = factory.createMainCourses();
        desserts = factory.createDesserts();
        drinks = factory.createDrinks();
    }
}