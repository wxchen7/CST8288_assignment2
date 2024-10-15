package components.spring;

import components.base.Entree;

public class SpringEntree implements Entree {

    private final String name;

    public SpringEntree(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
