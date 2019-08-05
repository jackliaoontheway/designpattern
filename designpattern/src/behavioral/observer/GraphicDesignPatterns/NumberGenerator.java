package behavioral.observer.GraphicDesignPatterns;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {

	private List<Observer> observerList = new ArrayList<>();

	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(this);
		}
	}

	abstract int getNumber();

	abstract void execute();

}
