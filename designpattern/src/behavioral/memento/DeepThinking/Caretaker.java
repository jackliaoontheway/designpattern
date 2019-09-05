package behavioral.memento.DeepThinking;

public class Caretaker {

    private Memento memento = null;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento retriveMemento() {
        return this.memento;
    }

}
