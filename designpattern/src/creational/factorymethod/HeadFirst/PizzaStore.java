package creational.factorymethod.HeadFirst;

import creational.simplefactory.HeadFirst.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.out();
        return pizza;
    }

    public abstract Pizza createPizza(String type);


}
