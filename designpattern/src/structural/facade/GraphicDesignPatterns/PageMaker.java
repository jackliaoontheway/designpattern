package structural.facade.GraphicDesignPatterns;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

	private PageMaker() {

	}

	public static void makeWelcomePage(String mailAdress, String filename) {
		Properties mailpro = Database.getProperties(filename);
		String username = mailpro.getProperty("username");
		try {
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("title");
			writer.paragraph("paragraph");
			writer.mailto(mailAdress, username);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
