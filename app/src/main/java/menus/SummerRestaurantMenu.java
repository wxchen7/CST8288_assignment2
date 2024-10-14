package menus;

import menu_factory.RestaurantMenuFactory;

public class SummerRestaurantMenu extends RestaurantMenu {

    private final RestaurantMenuFactory factory;

    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
        setName("Summer Menu");
        setPeriod("June 1 to August 31.");
    }

    @Override
    public void populateMenu() {
        entrees = factory.createEntrees();
        mainCourses = factory.createMainCourses();
        desserts = factory.createDesserts();
        drinks = factory.createDrinks();
    }
}