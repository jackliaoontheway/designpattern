package creational.prototype.GraphicDesignPatterns;

public class SubProduct implements Cloneable {
	private String subName;

	public SubProduct(String name) {
		this.subName = name;
	}

	public String getSubName() {
		return subName;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
