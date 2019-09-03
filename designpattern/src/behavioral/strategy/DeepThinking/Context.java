package behavioral.strategy.DeepThinking;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextOperation( ) {
        this.strategy.algorithmInterface();
    }

}
