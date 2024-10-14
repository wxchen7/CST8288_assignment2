package components.summer;

import components.base.Drink;

public class SummerDrink implements Drink {

    private final String name;
    private final double price;

    public SummerDrink(String name, double price) {
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
