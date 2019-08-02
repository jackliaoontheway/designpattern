package behavioral.visitor.GraphicDesignPatterns;

public interface Visitor {
	
	void visit(File file);
	
	void visit(Directory element);
	
}
