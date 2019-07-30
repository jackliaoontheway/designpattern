package structural.bridge.GraphicDesignPatterns;

public class Display {
	
	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public final void display() {
		open();
		print();
		close();
	}
	
	public void open() {
		impl.rawOpen();
	}
	
	public void print() {
		impl.rawPrint();
	}
	
	public void close() {
		impl.rowClose();
	}
	
}
