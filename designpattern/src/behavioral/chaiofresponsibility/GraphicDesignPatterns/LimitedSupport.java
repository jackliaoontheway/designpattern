package behavioral.chaiofresponsibility.GraphicDesignPatterns;

public class LimitedSupport extends Support {

	private int number;

	public LimitedSupport(String name,int number) {
		super(name);
		this.number = number;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (number > trouble.getNumber()) {
			return true;
		}
		return false;
	}

}
