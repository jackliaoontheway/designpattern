package behavioral.strategy.GraphicDesignPatterns;

public class Main {

	public static void main(String[] args) {
		Human jack = new Human(new RandomStrategy());
		jack.play();
		Human cherry = new Human(new WinStrategy());
		cherry.play();
	}

}
