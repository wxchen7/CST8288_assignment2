package components.winter;

import components.base.Drink;

public class WinterDrink implements Drink {

    private final String name;

    public WinterDrink(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
