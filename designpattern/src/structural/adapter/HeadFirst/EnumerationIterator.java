package structural.adapter.HeadFirst;

public class EnumerationIterator<T> implements Iterator<T> {

    private Enumeration<T> enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElement();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

    /**
     * 对于不支持的方法 可以抛出 UnsupportedOperationException
     * @return
     */
    @Override
    public boolean remove() {
        throw new UnsupportedOperationException();
    }
}
