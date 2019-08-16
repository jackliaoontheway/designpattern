package creational.abstractfactory.GraphicDesignPatterns;

import creational.abstractfactory.GraphicDesignPatterns.factory.Link;
import creational.abstractfactory.GraphicDesignPatterns.factory.Tray;
import creational.abstractfactory.GraphicDesignPatterns.factory.Factory;
import creational.abstractfactory.GraphicDesignPatterns.factory.Page;

public class HtmlFactory extends Factory{

	@Override
	protected Link createLink() {
		return new HtmlLink();
	}

	@Override
	protected Tray createTray() {
		return new HtmlTray();
	}

	@Override
	protected Page createPage() {
		return new HtmlPage();
	}
	
}
