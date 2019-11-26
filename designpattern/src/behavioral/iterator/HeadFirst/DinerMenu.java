package behavioral.iterator.HeadFirst;


import java.util.List;

public class DinerMenu implements Menu<String> {

    List<String> items;

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(items);
    }
}
