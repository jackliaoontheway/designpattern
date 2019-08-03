package structural.facade.GraphicDesignPatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Database {

	private Database() {

	}

	public static Properties getProperties(String dbname) {
		String filenameString = dbname + "*.txt";
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(filenameString));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

}
