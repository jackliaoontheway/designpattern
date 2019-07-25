package creational.factorymethod.GraphicDesignPatterns;

public abstract class AbstractFactory {

	public Product create() {
		Product product = createProduct();
		register(product);
		return product;
	}

	protected abstract void register(Product product);

	protected abstract Product createProduct();

}
