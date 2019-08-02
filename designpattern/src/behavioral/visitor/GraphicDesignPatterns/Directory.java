package behavioral.visitor.GraphicDesignPatterns;

import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

	private String name;
	private List<Entry> entries;

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long size() {
		long size = 0;
		if (entries != null) {
			for (Entry entry : entries) {
				size += entry.size();
			}
		}
		return size;
	}

	@Override
	public Entry add(Entry entry) {
		entries.add(entry);
		return this;
	}

	@Override
	protected void printList(String prefix) {
		for (Entry entry : entries) {
			entry.printList(prefix);
		}
	}
	
	public Iterator<Entry> iterator() {
		return entries.iterator();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
