package structural.composite.HeadFirst;

public class MenuItem implements MenuComponent {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public void addComponent(MenuComponent component) {

    }

    @Override
    public boolean removeComponent(MenuComponent component) {
        return false;
    }

    @Override
    public MenuComponent getChild(int n) {
        return null;
    }
}
