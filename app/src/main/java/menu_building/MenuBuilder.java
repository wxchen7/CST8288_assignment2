package menu_building;

public interface MenuBuilder {

    MenuBuilder buildEntrees();
    MenuBuilder buildMainCourses();
    MenuBuilder buildDesserts();
    MenuBuilder buildDrinks();

}