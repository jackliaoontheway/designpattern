package creational.builder.DeepThinking;

public class ConcreteBuilder implements Builder {

    private Product product;

    public Product getResult() {
        return product;
    }

    @Override
    public void buildPart() {
        // 构建某个部件的功能处理
    }
}
