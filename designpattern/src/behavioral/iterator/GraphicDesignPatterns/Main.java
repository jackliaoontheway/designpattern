package behavioral.iterator.GraphicDesignPatterns;

public class Main {
	public static void main(String[] args) {

		BookShelf shelf = new BookShelf(3);
		shelf.addBook(new Book("图解设计模式"));
		shelf.addBook(new Book("大话设计模式"));
		shelf.addBook(new Book("设计模式之禅"));

		Iterator<Book> iterator = shelf.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}
}
