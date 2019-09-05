package behavioral.memento.DeepThinking;

public class Originator {

    private String state = "";

    public Memento createMemento() {
        return new MementoImpl(state);
    }

    public void setMemento(Memento memento) {
        MementoImpl impl = (MementoImpl)memento;
        this.state = impl.getState();
    }

}
