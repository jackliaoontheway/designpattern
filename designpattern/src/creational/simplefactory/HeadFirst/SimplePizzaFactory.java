package creational.simplefactory.HeadFirst;

public class SimplePizzaFactory {

    public Pizza creaePizza(String type) {
        Pizza pizza = null;
        if ("Cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("Greek".equals(type)) {
            pizza = new GreekPizza();
        }
        return pizza;
    }

}
