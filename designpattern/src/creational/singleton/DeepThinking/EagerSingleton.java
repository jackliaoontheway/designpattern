package creational.singleton.DeepThinking;

public class EagerSingleton {

	private final static EagerSingleton INSTANCE = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return INSTANCE;
	}

}
