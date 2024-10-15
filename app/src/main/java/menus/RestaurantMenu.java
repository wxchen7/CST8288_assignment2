package menus;

import components.base.*;

import java.util.List;

/**
 * Abstract class representing a restaurant menu.
 * This class provides the basic structure for different seasonal menus.
 */

public abstract class RestaurantMenu {

    private String name; // Menu name
    private String period; // Period during which the menu is active

    protected List<Entree> entrees;
    protected List<MainCourse> mainCourses;
    protected List<Dessert> desserts;
    protected List<Drink> drinks;

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

    // Abstract method to be implemented by subclasses to populate the menu
    public abstract void populateMenu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adding items to ").append(getName()).append("\n");
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
            for (Object obj : items) {
                if (obj instanceof MenuItem item) {
                    sb.append("- ").append(item.getName()).append("\n");
                }
            }
        }
        sb.append("\n");
    }
}
