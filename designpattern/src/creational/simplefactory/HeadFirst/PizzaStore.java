package creational.simplefactory.HeadFirst;

public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.simplePizzaFactory = factory;
    }

    public Pizza orderPizza(String type) {

        /**
         * SimplePizzaFactory 针对 PizzaStore来说，当pizza种类发生改变，pizzastore不会受影响
         * SimplePizzFactory 可以有很多 像PizzaStore客户端
         */
        Pizza pizza = simplePizzaFactory.creaePizza(type);

        pizza.prepare();

        pizza.bake();

        pizza.out();

        return pizza;

    }

}
