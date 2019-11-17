package structural.decorator.HeadFirst;

public abstract class Beverage {

    private String description;

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    protected abstract float cost();
}
