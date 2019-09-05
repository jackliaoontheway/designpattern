package behavioral.memento.DeepThinking;

public class MementoImpl implements Memento {

    private String state;

    public MementoImpl(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
