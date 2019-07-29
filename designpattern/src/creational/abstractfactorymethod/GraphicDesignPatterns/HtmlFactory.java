package creational.abstractfactorymethod.GraphicDesignPatterns;

import creational.abstractfactorymethod.GraphicDesignPatterns.factory.Factory;
import creational.abstractfactorymethod.GraphicDesignPatterns.factory.Link;
import creational.abstractfactorymethod.GraphicDesignPatterns.factory.Page;
import creational.abstractfactorymethod.GraphicDesignPatterns.factory.Tray;

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
