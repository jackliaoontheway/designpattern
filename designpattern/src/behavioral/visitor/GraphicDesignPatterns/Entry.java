package behavioral.visitor.GraphicDesignPatterns;

/**
 * @author user
 *
 */
public abstract class Entry implements Element {

	public abstract String getName();

	public abstract long size();

	public Entry add(Entry entry) {
		return this;
	}

	public void printList() {
		printList("");
	}

	protected abstract void printList(String prefix);

	@Override
	public String toString() {
		return getName() + "(" + size() + ")";
	}
}
