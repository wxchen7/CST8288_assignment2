package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;
import components.winter.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete factory for creating Winter menu items.
 * This class implements the RestaurantMenuFactory interface to create specific Spring menu items.
 */

public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public List<Drink> createDrinks() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new WinterDrink("Hot Chocolate"));
        drinks.add(new WinterDrink("Mulled Wine"));
        drinks.add(new WinterDrink("Peppermint Mocha"));
        return drinks;
    }

    @Override
    public List<MainCourse> createMainCourses() {
        List<MainCourse> mainCourses = new ArrayList<>();
        mainCourses.add(new WinterMainCourse("Beef Stew"));
        mainCourses.add(new WinterMainCourse("Roast Turkey with Stuffing"));
        mainCourses.add(new WinterMainCourse("Vegetarian Lasagna"));
        return mainCourses;
    }

    @Override
    public List<Entree> createEntrees() {
        List<Entree> entrees = new ArrayList<>();
        entrees.add(new WinterEntree("French Onion Soup"));
        entrees.add(new WinterEntree("Winter Salad"));
        entrees.add(new WinterEntree("Baked Brie"));
        return entrees;
    }

    @Override
    public List<Dessert> createDesserts() {
        List<Dessert> desserts = new ArrayList<>();
        desserts.add(new WinterDessert("Chocolate Lava Cake"));
        desserts.add(new WinterDessert("Gingerbread Pudding"));
        desserts.add(new WinterDessert("Pear Tart"));
        return desserts;
    }

}
