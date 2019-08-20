package creational.builder.DeepThinking.demo;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new TextBuilder());
        director.construct();
    }
}
