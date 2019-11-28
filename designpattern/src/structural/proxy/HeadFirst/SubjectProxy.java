package structural.proxy.HeadFirst;

public class SubjectProxy implements Proxy {

    Subject subject;

    @Override
    public void request() {
        subject.operation();
    }
}
