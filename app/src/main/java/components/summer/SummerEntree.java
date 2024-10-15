package components.summer;

import components.base.Entree;

public class SummerEntree implements Entree {

    private final String name;

    public SummerEntree(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
