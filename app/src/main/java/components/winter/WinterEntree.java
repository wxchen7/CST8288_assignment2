package components.winter;

import components.base.Entree;

public class WinterEntree implements Entree {

    private final String name;

    public WinterEntree(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
