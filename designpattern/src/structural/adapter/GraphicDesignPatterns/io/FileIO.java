package structural.adapter.GraphicDesignPatterns.io;

public interface FileIO {
	
	void readFromFile(String fileName) throws Exception;
	
	void writeToFile(String fileName) throws Exception;
	
	void setValue(String key, String value);
	
	void getValue(String key);
	
}
