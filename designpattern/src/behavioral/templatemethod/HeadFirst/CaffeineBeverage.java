package behavioral.templatemethod.HeadFirst;

public abstract class CaffeineBeverage {

    /**
     * 父类定义算法流程，框架
     * 此方法为final 意味着子类不可重写
     */
    public final void prepareRecipe() {

        boilWater();

        brew(); // 具体子类实现

        pourInCup();

        addCondiments(); // 具体子类实现
    }

    private void boilWater() {

    }

    private void pourInCup() {

    }

    protected abstract void brew();

    protected abstract void addCondiments();


}
