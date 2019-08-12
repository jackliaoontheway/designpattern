package creational.simplefactory.DeepThinking;

public class Factory {

    public static Api createApi() {

    	return new ApiImpl();
    }

}
