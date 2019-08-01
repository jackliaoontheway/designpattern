package structural.decorator.GraphicDesignPatterns;

public class Main {

	public static void main(String[] args) {
		Display display = new StringDisplay("hello");
		Display display2 = new SideBorder(display);
		Display display3 = new FullBorder(display2);
		display3.getRowText(1);
	}

}
