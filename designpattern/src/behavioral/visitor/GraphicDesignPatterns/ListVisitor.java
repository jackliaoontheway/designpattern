package behavioral.visitor.GraphicDesignPatterns;

public class ListVisitor implements Visitor {

	@Override
	public void visit(File file) {
		System.out.println(file.getName());
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(directory.getName());
		while (directory.iterator().hasNext()) {
			directory.iterator().next().accept(this);
		}
	}

}
