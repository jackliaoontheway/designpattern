package structural.adapter.GraphicDesignPatterns.objecttype;

public class PrintBanner implements Printer {

	private Banner banner;

	public PrintBanner(Banner banner) {
		this.banner = banner;
	}

}
