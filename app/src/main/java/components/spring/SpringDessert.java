package components.spring;

import components.base.Dessert;

public class SpringDessert implements Dessert {

    private final String name;

    public SpringDessert(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
