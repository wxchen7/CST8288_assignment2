package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;
import components.fall.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete factory for creating Fall menu items.
 * This class implements the RestaurantMenuFactory interface to create specific Spring menu items.
 */

public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public List<Drink> createDrinks() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new FallDrink("Margarita"));
        drinks.add(new FallDrink("Dark Rum"));
        drinks.add(new FallDrink("Orange"));
        return drinks;
    }

    @Override
    public List<MainCourse> createMainCourses() {
        List<MainCourse> mainCourses = new ArrayList<>();
        mainCourses.add( new FallMainCourse("Salmon Avocado Toast"));
        mainCourses.add( new FallMainCourse("Pesto Chicken Penne Asiago"));
        mainCourses.add( new FallMainCourse("Portobello Mushroom Chicken"));
        return mainCourses;
    }

    @Override
    public List<Entree> createEntrees() {
        List<Entree> entrees = new ArrayList<>();
        entrees.add( new FallEntree("Spinach and Artichoke Dip"));
        entrees.add( new FallEntree("Sesame Soy Tuna Tartare"));
        entrees.add( new FallEntree("Tuscan Bruschetta"));
        return entrees;
    }

    @Override
    public List<Dessert> createDesserts() {
        List<Dessert> desserts = new ArrayList<>();
        desserts.add( new FallDessert("Carrot Cake"));
        desserts.add( new FallDessert("White Chocolate Cheesecake"));
        desserts.add( new FallDessert("Apple Pie"));
        return desserts;
    }
}