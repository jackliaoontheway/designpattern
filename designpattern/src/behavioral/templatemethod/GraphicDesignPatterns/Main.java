package behavioral.templatemethod.GraphicDesignPatterns;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay adisplay = new CharDisplay();
		adisplay.display();
	}
}
