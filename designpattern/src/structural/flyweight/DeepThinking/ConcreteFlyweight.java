package structural.flyweight.DeepThinking;

public class ConcreteFlyweight implements  Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String state) {
        this.intrinsicState = state;
    }

    @Override
    public void operation(String extrinsicState) {


    }
}
