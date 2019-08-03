package structural.facade.GraphicDesignPatterns;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {

	private Writer writer;

	public  HtmlWriter(Writer writer) {
		this.writer = writer;
	}

	public void title(String title) throws IOException {

		writer.write("<html>");
		writer.write("<body>");

	}

	public void paragraph(String msg) throws IOException {

		writer.write("<p>");
		writer.write(msg);
		writer.write("</p>");

	}

	public void link(String link) throws IOException {

		writer.write("<link>");
		writer.write(link);
		writer.write("</link>");

	}

	public void mailto(String mailAddress, String username) throws IOException {

		link(mailAddress + username);

	}

	public void close() throws IOException {

		writer.write("</body>");
		writer.write("</html>");

	}

}
