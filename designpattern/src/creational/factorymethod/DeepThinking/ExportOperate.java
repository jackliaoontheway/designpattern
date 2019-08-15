package creational.factorymethod.DeepThinking;

public abstract class ExportOperate {


    boolean export(String data) {
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    protected abstract ExportFileApi factoryMethod();


}
