package components.fall;

import components.base.Drink;

public class FallDrink implements Drink {

    private final String name;

    public FallDrink(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
