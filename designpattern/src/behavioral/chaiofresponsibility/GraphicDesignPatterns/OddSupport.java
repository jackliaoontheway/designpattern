package behavioral.chaiofresponsibility.GraphicDesignPatterns;

public class OddSupport extends Support {


	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (2 % trouble.getNumber() == 0) {
			return true;
		}
		return false;
	}

}