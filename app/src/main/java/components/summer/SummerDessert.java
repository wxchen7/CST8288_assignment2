package components.summer;

import components.base.Dessert;

public class SummerDessert implements Dessert {

    private final String name;

    public SummerDessert(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
