package behavioral.visitor.DeepThinking;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {


    private List<Element> list = new ArrayList<>();

    public void handleRequest(Visitor visitor) {
        for (Element e : list) {
            e.accept(visitor);
        }
    }

    public void addElement(Element element) {
        list.add(element);
    }


}
