package creational.simplefactory.DeepThinking;

public class Client {

    public static void main(String[] args) {

        Api api = Factory.createApi();

        api.operation();

        System.out.print("test");

    }

}
