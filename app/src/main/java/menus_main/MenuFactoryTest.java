package menus_main;

import menu_building.*;
import menu_factory.*;
import menus.*;

public class MenuFactoryTest {

    public static void main(String[] args) {

        System.out.println("-------------- Using Builder Pattern ------------");
        MenuBuilding theBuilding = new ConcreteMenuBuilding();

        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall");
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");

        System.out.println("============== Fall Menu (Builder) ==============");
        System.out.println(theFallMenu);
        System.out.println("============== Winter Menu (Builder) ==============");
        System.out.println(theWinterMenu);
        System.out.println("============== Spring Menu (Builder) ==============");
        System.out.println(theSpringMenu);
        System.out.println("============== Summer Menu (Builder) ==============");
        System.out.println(theSummerMenu);

        System.out.println("-------------- Using Factory Pattern ------------");

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

        System.out.println("============== Fall Menu (Factory) ==============");
        System.out.println(fallMenu);
        System.out.println("============== Winter Menu (Factory) ==============");
        System.out.println(winterMenu);
        System.out.println("============== Spring Menu (Factory) ==============");
        System.out.println(springMenu);
        System.out.println("============== Summer Menu (Factory) ==============");
        System.out.println(summerMenu);

    }
}