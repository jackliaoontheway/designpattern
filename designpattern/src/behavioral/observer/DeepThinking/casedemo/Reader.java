package behavioral.observer.DeepThinking.casedemo;

import behavioral.observer.DeepThinking.stardard.Observer;
import behavioral.observer.DeepThinking.stardard.Subject;

public class Reader implements Observer {
    @Override
    public void update(Subject subject) {
        subject.getContent();
    }
}
