package structural.composite.GraphicDesignPatterns;

public class Main {
	public static void main(String[] args) {

		Entry root = new Directory("root");
		Entry usr = new Directory("usr");
		Entry bin = new Directory("bin");

		root.add(usr);
		root.add(bin);

		Entry fileEntry = new File("tet.txt", 100);
		bin.add(fileEntry);
	}
}
