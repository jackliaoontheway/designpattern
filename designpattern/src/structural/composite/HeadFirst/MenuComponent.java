package structural.composite.HeadFirst;

public interface MenuComponent {

    String getName();

    String getDescription();

    double getPrice();

    boolean isVegetarian();

    void print();

    void addComponent(MenuComponent component);

    boolean removeComponent(MenuComponent component);

    MenuComponent getChild(int n);
}
