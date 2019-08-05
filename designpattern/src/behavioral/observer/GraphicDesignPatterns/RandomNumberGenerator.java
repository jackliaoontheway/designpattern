package behavioral.observer.GraphicDesignPatterns;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

	private int number;
	private Random random = new Random();

	@Override
	int getNumber() {
		return number;
	}

	@Override
	void execute() {

		number = random.nextInt(20);

		notifyObservers();

	}

}
