package behavioral.observer.DeepThinking.casedemo;

import behavioral.observer.DeepThinking.stardard.Subject;

public class NewsPaper extends Subject {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyObservers();
    }
}
