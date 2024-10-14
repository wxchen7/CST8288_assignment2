package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;
import components.spring.SpringDessert;
import components.spring.SpringDrink;
import components.spring.SpringEntree;
import components.spring.SpringMainCourse;

import java.util.Arrays;
import java.util.List;

public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public List<Drink> createDrinks() {
        return Arrays.asList(
                new SpringDrink("Strawberry Lemonade", 5.99),
                new SpringDrink("Iced Green Tea", 2.99),
                new SpringDrink("Cherry Blossom Cocktail", 6.99)
        );
    }

    @Override
    public List<MainCourse> createMainCourses() {
        return Arrays.asList(
                new SpringMainCourse("Grilled Lamb Chops", 22.99),
                new SpringMainCourse("Spring Vegetable Risotto", 16.99),
                new SpringMainCourse("Lemon Herb Roasted Chicken", 18.99)
        );
    }

    @Override
    public List<Entree> createEntrees() {
        return Arrays.asList(
                new SpringEntree("Asparagus Soup", 7.99),
                new SpringEntree("Spring Mix Salad", 9.99),
                new SpringEntree("Smoked Salmon Tartare", 11.99)
        );
    }

    @Override
    public List<Dessert> createDesserts() {
        return Arrays.asList(
                new SpringDessert("Lemon Tart", 6.99),
                new SpringDessert("Strawberry Shortcake", 7.99),
                new SpringDessert("Rhubarb Crumble", 6.99)
        );
    }
}