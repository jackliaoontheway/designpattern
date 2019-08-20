package creational.builder.DeepThinking.demo;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {

        builder.buildHeader();

        builder.buildBody();

        builder.buildFooter();
    }


}
