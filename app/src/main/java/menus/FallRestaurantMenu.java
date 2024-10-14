package menus;

import menu_factory.RestaurantMenuFactory;

public class FallRestaurantMenu extends RestaurantMenu {

    private final RestaurantMenuFactory factory;

    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
        setName("Fall Menu");
        setPeriod("September 1 to November 30.");
    }

    @Override
    public void populateMenu() {
        entrees = factory.createEntrees();
        mainCourses = factory.createMainCourses();
        desserts = factory.createDesserts();
        drinks = factory.createDrinks();
    }
}