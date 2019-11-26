package behavioral.iterator.HeadFirst;

import java.util.List;

public class DinerMenuIterator implements Iterator {

    List<String> items;
    int position;

    public DinerMenuIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position <= items.size();
    }

    @Override
    public String next() {
        return items.get(position++);
    }
}
