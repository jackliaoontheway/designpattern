package behavioral.templatemethod.DeepThinking.standarddemo;

public abstract class AbstractTemplate {
    /**
     * 模板方法
     * 注意 final 修饰，算法的骨架不可被子类重写
     */
    public final void templateMethod() {
        this.operation1();
        this.operation2();
        this.doPrimitiveOperation1();
        this.doPrimitiveOperation2();
        this.hookOperation1();
    }

    /**
     * 算法中的步骤 需要子类来实现
     */
    protected abstract void doPrimitiveOperation2();

    protected abstract void doPrimitiveOperation1();

    /**
     *  钩子操作，算法中的步骤  父类提供默认实现 子类不一定需要重写，
     */
    protected void hookOperation1() {

    }

    /**
     * 算法中的步骤 固定实现 子类可以访问 但是不能重写
     */
    protected final void operation2() {
    }

    /**
     * 算法中的步骤 固定实现 子类不需要访问
     */
    private void operation1() {
        
    }

    /**
     * 不是算法中的步骤，提供公共功能
     */
    protected void commonOperation() {

    }
}
