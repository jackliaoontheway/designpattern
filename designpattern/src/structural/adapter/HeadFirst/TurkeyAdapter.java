package structural.adapter.HeadFirst;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        this.turkey.fly();
    }
}
