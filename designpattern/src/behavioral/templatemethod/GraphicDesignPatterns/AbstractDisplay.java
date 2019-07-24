package behavioral.templatemethod.GraphicDesignPatterns;

public abstract class AbstractDisplay {

	public final void display() {

		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();

	}

	protected abstract void close();

	protected abstract void print();

	protected abstract void open();

}
