package behavioral.iterator.GraphicDesignPatterns;

public class BookShelfIterator implements Iterator<Book> {

	private int index = 0;
	private BookShelf bookShelf;

	BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	@Override
	public boolean hasNext() {
		return index < bookShelf.size();
	}

	@Override
	public Book next() {
		return bookShelf.getBookAt(index++);
	}

}
