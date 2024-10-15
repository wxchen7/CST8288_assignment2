package components.spring;

import components.base.Drink;

public class SpringDrink implements Drink {

    private final String name;

    public SpringDrink(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
