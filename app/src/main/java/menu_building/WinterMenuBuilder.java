package menu_building;

import menu_factory.RestaurantMenuFactory;
import menus.RestaurantMenu;

public class WinterMenuBuilder implements MenuBuilder {

    private final RestaurantMenu menu;
    private final RestaurantMenuFactory factory;

    public WinterMenuBuilder(RestaurantMenu menu, RestaurantMenuFactory factory) {
        this.menu = menu;
        this.factory = factory;
    }

    @Override
    public MenuBuilder buildEntrees() {
        menu.setEntrees(factory.createEntrees());
        return this;
    }

    @Override
    public MenuBuilder buildMainCourses() {
        menu.setMainCourses(factory.createMainCourses());
        return this;
    }

    @Override
    public MenuBuilder buildDesserts() {
        menu.setDesserts(factory.createDesserts());
        return this;
    }

    @Override
    public MenuBuilder buildDrinks() {
        menu.setDrinks(factory.createDrinks());
        return this;
    }

}