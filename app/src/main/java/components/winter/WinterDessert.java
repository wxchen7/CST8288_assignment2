package components.winter;

import components.base.Dessert;

public class WinterDessert implements Dessert {

    private final String name;

    public WinterDessert(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
