package behavioral.iterator.GraphicDesignPatterns;

public class BookShelf implements Aggregate<Book> {

	private Book[] books;
	private int index;

	public BookShelf(int length) {
		this.index = 0;
		this.books = new Book[length];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}

	public int size() {
		return this.index;
	}

	public void addBook(Book book) {
		this.books[index++] = book;
	}

}
