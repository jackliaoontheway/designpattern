package behavioral.observer.DeepThinking.stardard;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    public abstract String getContent();
}
