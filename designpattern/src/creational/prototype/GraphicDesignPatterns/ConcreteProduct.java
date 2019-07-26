package creational.prototype.GraphicDesignPatterns;

public class ConcreteProduct implements Product {

	private String name;
	
	private SubProduct subProduct;
	
	public String getName() {
		return name;
	}
	
	

	public SubProduct getSubProduct() {
		return subProduct;
	}



	public void setSubProduct(SubProduct subProduct) {
		this.subProduct = subProduct;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ConcreteProduct(String name) {
		this.name = name;
	}

	@Override
	public Product createClone() {
		Product product = null;
		try {
			product = (Product) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return product;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		ConcreteProduct concreteProduct = (ConcreteProduct)super.clone();
		concreteProduct.setSubProduct((SubProduct)subProduct.clone());
		return concreteProduct;
	}
	
}
