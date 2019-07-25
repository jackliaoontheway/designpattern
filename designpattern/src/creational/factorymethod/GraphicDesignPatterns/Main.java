package creational.factorymethod.GraphicDesignPatterns;

public class Main {
	public static void main(String[] args) {
		AbstractFactory factory = new IDCardFactory();
		factory.create();
	}
}
