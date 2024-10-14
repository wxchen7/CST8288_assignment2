package components.fall;

import components.base.Dessert;

public class FallDessert implements Dessert {

    private final String name;
    private final double price;

    public FallDessert(String name, double price) {
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
