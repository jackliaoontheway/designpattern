package behavioral.observer.DeepThinking.stardard;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Subject subject) {
        subject.getContent();
    }
}
