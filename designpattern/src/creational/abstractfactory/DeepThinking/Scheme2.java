package creational.abstractfactory.DeepThinking;

public class Scheme2 extends AbstractFactory {
    @Override
    AbstractCpu createCpu() {
        return new AmdCpu(986);
    }

    @Override
    AbstractMainboard createMainBoard() {
        return new MSIMainboard(986);
    }
}

