package components.summer;

import components.base.MainCourse;

public class SummerMainCourse implements MainCourse {

    private final String name;

    public SummerMainCourse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
