package behavioral.strategy.GraphicDesignPatterns;

public class Human {
	private Strategy strategy;

	public Human(Strategy strategy) {
		this.strategy = strategy;
	}

	public void play() {
		strategy.show();
	}

}
