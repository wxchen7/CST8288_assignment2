package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;
import components.fall.FallDessert;
import components.fall.FallDrink;
import components.fall.FallEntree;
import components.fall.FallMainCourse;

import java.util.Arrays;
import java.util.List;

public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public List<Drink> createDrinks() {
        return Arrays.asList(
                new FallDrink("Margarita", 8.99),
                new FallDrink("Dark Rum", 9.99),
                new FallDrink("Orange Juice", 2.99)
        );
    }

    @Override
    public List<MainCourse> createMainCourses() {
        return Arrays.asList(
                new FallMainCourse("Salmon Avocado Toast", 14.99),
                new FallMainCourse("Pesto Chicken Penne Asiago", 13.99),
                new FallMainCourse("Portobello Mushroom Chicken", 15.99)
        );
    }

    @Override
    public List<Entree> createEntrees() {
        return Arrays.asList(
                new FallEntree("Spinach and Artichoke Dip", 8.99),
                new FallEntree("Sesame Soy Tuna Tartare", 12.99),
                new FallEntree("Tuscan Bruschetta", 13.99)
        );
    }

    @Override
    public List<Dessert> createDesserts() {
        return Arrays.asList(
                new FallDessert("Carrot Cake", 6.99),
                new FallDessert("White Chocolate Cheesecake", 7.99),
                new FallDessert("Apple Pie", 5.99)
        );
    }
}