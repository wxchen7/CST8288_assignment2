package menu_factory;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;

import java.util.List;

public interface RestaurantMenuFactory {

    List<Drink> createDrinks();

    List<MainCourse> createMainCourses();

    List<Entree> createEntrees();

    List<Dessert> createDesserts();

}