package behavioral.observer.DeepThinking.stardard;

public class ConcreteSubject extends Subject {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {

        this.status = status;

        this.notifyObservers();

    }


    @Override
    public String getContent() {
        return this.status;
    }
}
