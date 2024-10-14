package menus_main;

import menu_factory.*;
import menus.*;

public class MenuFactoryTest {

    public static void main(String[] args) {

//        MenuBuilding theBuilding = new ConcreteMenuBuilding();
//
//        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall");
//        System.out.println(theFallMenu);
//
//        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
//        System.out.println(theWinterMenu);
//
//        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
//        System.out.println(theSpringMenu);
//
//        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
//        System.out.println(theSummerMenu);

        RestaurantMenuFactory fallFactory = new FallRestaurantMenuFactory();
        RestaurantMenuFactory winterFactory = new WinterRestaurantMenuFactory();
        RestaurantMenuFactory springFactory = new SpringRestaurantMenuFactory();
        RestaurantMenuFactory summerFactory = new SummerRestaurantMenuFactory();

        RestaurantMenu fallMenu = new FallRestaurantMenu(fallFactory);
        RestaurantMenu winterMenu = new WinterRestaurantMenu(winterFactory);
        RestaurantMenu springMenu = new SpringRestaurantMenu(springFactory);
        RestaurantMenu summerMenu = new SummerRestaurantMenu(summerFactory);

        fallMenu.populateMenu();
        winterMenu.populateMenu();
        springMenu.populateMenu();
        summerMenu.populateMenu();

        System.out.println("==== Fall Menu ====");
        System.out.println(fallMenu);
        System.out.println("==== Winter Menu ====");
        System.out.println(winterMenu);
        System.out.println("==== Spring Menu ====");
        System.out.println(springMenu);
        System.out.println("==== Summer Menu ====");
        System.out.println(summerMenu);

    }
}
