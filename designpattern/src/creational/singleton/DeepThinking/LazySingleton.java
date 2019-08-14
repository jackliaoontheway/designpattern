package creational.singleton.DeepThinking;

public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {

	}

	public static synchronized LazySingleton getInstance1() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	public static LazySingleton getInstance2() {
		if(instance == null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}

}
