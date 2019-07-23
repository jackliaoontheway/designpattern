package structural.adapter.GraphicDesignPatterns.io;

import java.io.FileInputStream;

public class FileProperties extends Properties implements FileIO {

	public void readFromFile(String fileName) throws Exception {
		this.load(new FileInputStream(fileName));
	}

	public void writeToFile(String fileName) throws Exception{
		
	}

	public void setValue(String key, String value) {
		
	}

	public void getValue(String key) {
		
	}

}
