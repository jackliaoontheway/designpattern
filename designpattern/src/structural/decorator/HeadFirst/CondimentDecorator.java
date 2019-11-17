package structural.decorator.HeadFirst;

public abstract class CondimentDecorator {

    private Beverage beverage;

    public CondimentDecorator (Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
