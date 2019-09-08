package behavioral.chaiofresponsibility.DeepThinking;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest() {
        boolean condition = false;
        if(condition) {
            // 如果属于自己处理的职责范围 则处理
        } else {
            if(this.successor != null) {
                this.successor.handleRequest();
            }
        }
    }
}
