package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;
import components.spring.*;

import java.util.ArrayList;
import java.util.List;

public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public List<Drink> createDrinks() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new SpringDrink("Strawberry Lemonade"));
        drinks.add(new SpringDrink("Iced Green Tea"));
        drinks.add(new SpringDrink("Cherry Blossom Cocktail"));
        return drinks;
    }

    @Override
    public List<MainCourse> createMainCourses() {
        List<MainCourse> mainCourses = new ArrayList<>();
        mainCourses.add(new SpringMainCourse("Grilled Lamb Chops"));
        mainCourses.add(new SpringMainCourse("Spring Vegetable Risotto"));
        mainCourses.add(new SpringMainCourse("Lemon Herb Roasted Chicken"));
        return mainCourses;
    }

    @Override
    public List<Entree> createEntrees() {
        List<Entree> entrees = new ArrayList<>();
        entrees.add(new SpringEntree("Asparagus Soup"));
        entrees.add(new SpringEntree("Spring Mix Salad"));
        entrees.add(new SpringEntree("Smoked Salmon Tartare"));
        return entrees;
    }

    @Override
    public List<Dessert> createDesserts() {
        List<Dessert> desserts = new ArrayList<>();
        desserts.add(new SpringDessert("Lemon Tart"));
        desserts.add(new SpringDessert("Strawberry Shortcake"));
        desserts.add(new SpringDessert("Rhubarb Crumble"));
        return desserts;
    }

}
