package structural.composite.GraphicDesignPatterns;

public class File extends Entry {

	private String fileName;
	private int size;

	public File(String fileName, int size) {
		this.fileName = fileName;
		this.size = size;
	}

	@Override
	public String getName() {
		return fileName;
	}

	@Override
	public long size() {
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}

}
