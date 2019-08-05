package behavioral.observer.GraphicDesignPatterns;

public class GraphObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		for (int i = 0; i < generator.getNumber(); i++) {
			System.out.print("*");
		}
	}

}
