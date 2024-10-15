package components.summer;

import components.base.Drink;

public class SummerDrink implements Drink {

    private final String name;

    public SummerDrink(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
