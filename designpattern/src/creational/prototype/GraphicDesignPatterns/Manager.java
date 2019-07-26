package creational.prototype.GraphicDesignPatterns;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	private Map<String, Product> boxes = new HashMap<String, Product>();

	public void register(String name, Product product) {
		boxes.put(name, product);
	}

	public Product createClone(String name) {
		return boxes.get(name).createClone();
	}

}
