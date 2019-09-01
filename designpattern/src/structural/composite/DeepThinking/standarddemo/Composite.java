package structural.composite.DeepThinking.standarddemo;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {


    private List<Component> components = new ArrayList<>();

    @Override
    public void someOperation() {
        for(Component component : components) {
            component.someOperation();
        }
    }

    public void addChild(Component child) {
        components.add(child);
    }

    public void removeChild(Component child) {
        // 默认抛出异常，Leaf对象没有这个功能
        components.remove(child);
    }

    public Component getChild(int child) {
       return components.get(child);
    }
}
