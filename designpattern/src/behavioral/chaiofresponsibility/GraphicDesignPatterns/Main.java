package behavioral.chaiofresponsibility.GraphicDesignPatterns;

public class Main {
	public static void main(String[] args) {

		Support support = new NoSupport("nosupport").setNext(new LimitedSupport("limitedsupport", 5)
				.setNext(new OddSupport("oddSupport").setNext(new SpecialSupport("specialsupport", 5))));
		
		support.support(new Trouble(3));
		
	}
}
