package structural.decorator.GraphicDesignPatterns;

public class FullBorder extends Border {

	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		return 0;
	}

	@Override
	public int getRows() {
		return 0;
	}

	@Override
	public String getRowText(int row) {
		return null;
	}

}
