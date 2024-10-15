package components.fall;

import components.base.MainCourse;

public class FallMainCourse implements MainCourse {

    private final String name;

    public FallMainCourse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
