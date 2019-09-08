package structural.decorator.DeepThinking;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();;
        // add some operation
        // add some ... 动态添加功能
    }

}
