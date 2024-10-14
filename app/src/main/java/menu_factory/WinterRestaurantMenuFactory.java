package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;
import components.winter.WinterDessert;
import components.winter.WinterDrink;
import components.winter.WinterEntree;
import components.winter.WinterMainCourse;

import java.util.Arrays;
import java.util.List;

public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public List<Drink> createDrinks() {
        return Arrays.asList(
                new WinterDrink("Hot Chocolate", 4.99),
                new WinterDrink("Mulled Wine", 7.99),
                new WinterDrink("Peppermint Mocha", 5.99)
        );
    }

    @Override
    public List<MainCourse> createMainCourses() {
        return Arrays.asList(
                new WinterMainCourse("Beef Stew", 17.99),
                new WinterMainCourse("Roast Turkey with Stuffing", 22.99),
                new WinterMainCourse("Vegetarian Lasagna", 16.99)
        );
    }

    @Override
    public List<Entree> createEntrees() {
        return Arrays.asList(
                new WinterEntree("French Onion Soup", 8.99),
                new WinterEntree("Winter Salad with Roasted Squash", 10.99),
                new WinterEntree("Baked Brie", 11.99)
        );
    }

    @Override
    public List<Dessert> createDesserts() {
        return Arrays.asList(
                new WinterDessert("Chocolate Lava Cake", 5.99),
                new WinterDessert("Apple Crumble", 8.99),
                new WinterDessert("Gingerbread Pudding", 6.99)
        );
    }
}