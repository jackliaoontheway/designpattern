package structural.decorator.GraphicDesignPatterns;

public abstract class Border extends Display {

	private Display display;

	public Border(Display display) {
		this.display = display;
	}

}
