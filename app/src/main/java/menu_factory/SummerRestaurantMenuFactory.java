package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;
import components.summer.SummerDessert;
import components.summer.SummerDrink;
import components.summer.SummerEntree;
import components.summer.SummerMainCourse;

import java.util.Arrays;
import java.util.List;

public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public List<Drink> createDrinks() {
        return Arrays.asList(
                new SummerDrink("Pina Colada", 6.99),
                new SummerDrink("Iced Peach Tea", 5.99),
                new SummerDrink("Watermelon Mojito", 9.99)
        );
    }

    @Override
    public List<MainCourse> createMainCourses() {
        return Arrays.asList(
                new SummerMainCourse("Grilled Seafood Platter", 22.99),
                new SummerMainCourse("BBQ Ribs", 18.99),
                new SummerMainCourse("Vegetable Kebabs", 16.99)
        );
    }

    @Override
    public List<Entree> createEntrees() {
        return Arrays.asList(
                new SummerEntree("Chilled Gazpacho", 7.99),
                new SummerEntree("Caprese Salad", 8.99),
                new SummerEntree("Bruschetta", 6.99)
        );
    }

    @Override
    public List<Dessert> createDesserts() {
        return Arrays.asList(
                new SummerDessert("Fresh Fruit Tart", 7.99),
                new SummerDessert("Lemon Sorbet", 5.99),
                new SummerDessert("Berry Pavlova", 8.99)
        );
    }
}