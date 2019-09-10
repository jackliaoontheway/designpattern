package behavioral.visitor.DeepThinking;

public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        elementA.operationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        elementB.operationB();
    }
}
