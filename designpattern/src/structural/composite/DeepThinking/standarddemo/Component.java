package structural.composite.DeepThinking.standarddemo;

public abstract class Component {

    public abstract void someOperation();

    public void addChild(Component child) {
        // 默认抛出异常，Leaf对象没有这个功能
        throw new UnsupportedOperationException();
    }

    public void removeChild(Component child) {
        // 默认抛出异常，Leaf对象没有这个功能
        throw new UnsupportedOperationException();
    }

    public Component getChild(int child) {
        // 默认抛出异常，Leaf对象没有这个功能
        throw new UnsupportedOperationException();
    }


}
