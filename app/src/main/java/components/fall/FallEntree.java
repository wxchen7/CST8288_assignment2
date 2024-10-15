package components.fall;

import components.base.Entree;

public class FallEntree implements Entree {

    private final String name;

    public FallEntree(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
