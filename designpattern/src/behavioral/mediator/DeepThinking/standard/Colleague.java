package behavioral.mediator.DeepThinking.standard;


public abstract  class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public void doSomething() {

    }

}
