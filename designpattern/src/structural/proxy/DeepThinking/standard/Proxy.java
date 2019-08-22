package structural.proxy.DeepThinking.standard;

public class Proxy implements Subject {

    // 被代理的目标对象
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        // 调用前 执行一些功能处理
        subject.request();
        // 调用后 执行一些功能处理
    }
}
