package components.fall;

import components.base.MainCourse;

public class FallMainCourse implements MainCourse {

    private final String name;
    private final double price;

    public FallMainCourse(String name, double price) {
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
