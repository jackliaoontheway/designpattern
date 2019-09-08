package behavioral.chaiofresponsibility.DeepThinking;

public class Client {

    public static void main(String[] args) {
        Handler handler = new ConcreteHandler1();
        Handler successor = new ConcreteHandler2();

        handler.setSuccessor(successor);
        handler.handleRequest();
    }


}
