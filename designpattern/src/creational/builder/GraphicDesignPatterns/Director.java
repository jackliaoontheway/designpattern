package creational.builder.GraphicDesignPatterns;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {

		builder.open();
		builder.create();
		builder.close();

	}

}
