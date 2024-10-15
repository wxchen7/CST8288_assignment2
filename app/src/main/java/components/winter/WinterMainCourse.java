package components.winter;

import components.base.MainCourse;

public class WinterMainCourse implements MainCourse {

    private final String name;

    public WinterMainCourse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
