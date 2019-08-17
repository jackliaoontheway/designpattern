package creational.abstractfactory.DeepThinking;

public class Scheme1 extends AbstractFactory {
    @Override
    AbstractCpu createCpu() {
        return new AmdCpu(1156);
    }

    @Override
    AbstractMainboard createMainBoard() {
        return new MSIMainboard(1156);
    }
}
