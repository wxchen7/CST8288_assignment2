package components.spring;

import components.base.Dessert;

public class SpringDessert implements Dessert {

    private final String name;
    private final double price;

    public SpringDessert(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }

}
