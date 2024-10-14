package menus;

import components.base.Dessert;
import components.base.Drink;
import components.base.Entree;
import components.base.MainCourse;

import java.util.List;

public abstract class RestaurantMenu {

    protected List<Entree> entrees;
    protected List<MainCourse> mainCourses;
    protected List<Dessert> desserts;
    protected List<Drink> drinks;
    private String name; // Menu name
    private String period; // Period during which the menu is active

    public void setEntrees(List<Entree> entrees) {
        this.entrees = entrees;
    }

    public void setMainCourses(List<MainCourse> mainCourses) {
        this.mainCourses = mainCourses;
    }

    public void setDesserts(List<Dessert> desserts) {
        this.desserts = desserts;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return this.period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public abstract void populateMenu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adding items to ").append(getName()).append("\n\n");
        sb.append("The ").append(getName()).append("\n");
        sb.append("Active: ").append(getPeriod()).append("\n\n");

        appendMenuItems(sb, "Entrees", entrees);
        appendMenuItems(sb, "Main Courses", mainCourses);
        appendMenuItems(sb, "Desserts", desserts);
        appendMenuItems(sb, "Drinks", drinks);

        return sb.toString();
    }

    private void appendMenuItems(StringBuilder sb, String category, List<?> items) {
        sb.append(category).append(":\n");
        if (items != null) {
            for (Object item : items) {
                sb.append(item.toString()).append("\n");
            }
        }
        sb.append("\n");
    }
}