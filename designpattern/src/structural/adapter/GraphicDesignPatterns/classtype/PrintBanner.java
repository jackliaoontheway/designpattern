package structural.adapter.GraphicDesignPatterns.classtype;

public class PrintBanner extends Banner implements Printer{

	@Override
	public void printWeak() {
		this.showWithAster();
	}

	@Override
	public void printStrong() {
		
	}

}
