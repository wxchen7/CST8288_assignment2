package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;

import java.util.List;

/**
 * Interface for creating menu items.
 * This factory interface defines methods to create different types of menu items.
 */

public interface RestaurantMenuFactory {

    List<Drink> createDrinks();
    List<MainCourse> createMainCourses();
    List<Entree> createEntrees();
    List<Dessert> createDesserts();

}