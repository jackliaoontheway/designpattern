package behavioral.observer.GraphicDesignPatterns;

public class Main {

	public static void main(String[] args) {

		Observer graObserver = new GraphObserver();
		Observer digitObserver = new DigitObserver();

		NumberGenerator generator = new RandomNumberGenerator();
		generator.addObserver(graObserver);
		generator.addObserver(digitObserver);

		generator.execute();

	}

}
