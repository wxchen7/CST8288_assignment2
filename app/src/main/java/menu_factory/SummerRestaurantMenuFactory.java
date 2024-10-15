package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;
import components.summer.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete factory for creating Summer menu items.
 * This class implements the RestaurantMenuFactory interface to create specific Spring menu items.
 */

public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public List<Drink> createDrinks() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new SummerDrink("Pina Colada"));
        drinks.add(new SummerDrink("Iced Peach Tea"));
        drinks.add(new SummerDrink("Watermelon Mojito"));
        return drinks;
    }

    @Override
    public List<MainCourse> createMainCourses() {
        List<MainCourse> mainCourses = new ArrayList<>();
        mainCourses.add(new SummerMainCourse("Grilled Seafood Platter"));
        mainCourses.add(new SummerMainCourse("BBQ Ribs"));
        mainCourses.add(new SummerMainCourse("Vegetable Kebabs"));
        return mainCourses;
    }

    @Override
    public List<Entree> createEntrees() {
        List<Entree> entrees = new ArrayList<>();
        entrees.add(new SummerEntree("Gazpacho"));
        entrees.add(new SummerEntree("Caprese Salad"));
        entrees.add(new SummerEntree("Grilled Shrimp Skewers"));
        return entrees;
    }

    @Override
    public List<Dessert> createDesserts() {
        List<Dessert> desserts = new ArrayList<>();
        desserts.add(new SummerDessert("Fresh Fruit Tart"));
        desserts.add(new SummerDessert("Lemon Sorbet"));
        desserts.add(new SummerDessert("Berry Pavlova"));
        return desserts;
    }

}
