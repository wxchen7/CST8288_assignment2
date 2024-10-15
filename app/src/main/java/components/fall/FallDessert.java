package components.fall;

import components.base.Dessert;

public class FallDessert implements Dessert {

    private final String name;

    public FallDessert(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
