package behavioral.templatemethod.GraphicDesignPatterns.test;

import behavioral.templatemethod.GraphicDesignPatterns.AbstractDisplay;
import behavioral.templatemethod.GraphicDesignPatterns.CharDisplay;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay adisplay = new CharDisplay();
		adisplay.display();
	}
}
