package creational.factorymethod.GraphicDesignPatterns;

public class IDCardFactory extends AbstractFactory{

	@Override
	protected void register(Product product) {
		
	}

	@Override
	protected Product createProduct() {
		return new IDCard();
	}

}
