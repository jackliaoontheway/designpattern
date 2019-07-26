package creational.prototype.GraphicDesignPatterns;

public class Main {

	public static void main(String[] args) {

		SubProduct subProduct = new SubProduct("subproduct");

		ConcreteProduct jack = new ConcreteProduct("jack");
		jack.setSubProduct(subProduct);

		Manager manager = new Manager();
		manager.register("jack", jack);

		ConcreteProduct clonedJack = (ConcreteProduct) manager.createClone("jack");

		System.out.println(jack.equals(clonedJack)); // false 说明不是同一个引用

		System.out.println(jack.getName().equals(clonedJack.getName())); // true

		// ConcreteProduct 重写 clone() , SubProduct 重写 clone(); 来实现深拷贝
		System.out.println(jack.getSubProduct().equals(clonedJack.getSubProduct())); // true 说明是同一个引用 浅拷贝
	}

}
