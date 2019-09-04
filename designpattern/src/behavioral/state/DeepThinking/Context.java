package behavioral.state.DeepThinking;

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String requestParameters) {
        state.handle(requestParameters);
    }

}
