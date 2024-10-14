package components.summer;

import components.base.Dessert;

public class SummerDessert implements Dessert {

    private final String name;
    private final double price;

    public SummerDessert(String name, double price) {
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
