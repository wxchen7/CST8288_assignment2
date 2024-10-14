package menus;

import menu_factory.RestaurantMenuFactory;

public class WinterRestaurantMenu extends RestaurantMenu {

    private final RestaurantMenuFactory factory;

    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
        setName("Winter Menu");
        setPeriod("December 1 to February 28.");
    }

    @Override
    public void populateMenu() {
        entrees = factory.createEntrees();
        mainCourses = factory.createMainCourses();
        desserts = factory.createDesserts();
        drinks = factory.createDrinks();
    }
}