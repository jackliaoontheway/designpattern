package creational.abstractfactory.DeepThinking;

public class Client {

    public static void main(String[] args) {


        AbstractFactory factory1 = new Scheme1();
        factory1.createCpu();
        factory1.createMainBoard();

        AbstractFactory factory2 = new Scheme2();
        factory2.createMainBoard();
        factory2.createCpu();

    }

}
