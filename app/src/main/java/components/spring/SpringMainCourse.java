package components.spring;

import components.base.MainCourse;

public class SpringMainCourse implements MainCourse {

    private final String name;

    public SpringMainCourse(String name) {

        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
