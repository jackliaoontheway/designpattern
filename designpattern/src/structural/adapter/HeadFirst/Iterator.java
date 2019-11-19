package structural.adapter.HeadFirst;

public interface Iterator<T> {

    boolean hasNext();

    T next();

    boolean remove();

}
