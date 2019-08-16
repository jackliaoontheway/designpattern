package creational.abstractfactory.GraphicDesignPatterns.factory;

public abstract class Factory {

	public static Factory getFactory(String factoryClassName) {

		Factory factory = null;
		try {
			factory = (Factory) Class.forName(factoryClassName).newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return factory;
	}

	protected abstract Link createLink();

	protected abstract Tray createTray();

	protected abstract Page createPage();

}
