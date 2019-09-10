package behavioral.visitor.DeepThinking;

public class Client {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();

        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();

        Visitor visitor = new ConcreteVisitor1();

        structure.addElement(elementA);
        structure.addElement(elementB);
        structure.handleRequest(visitor);
    }


}
