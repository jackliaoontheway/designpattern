package creational.factorymethod.DeepThinking;

public class Client {


    public static void main(String[] args) {
        ExportOperate exportOperate = new ExportDBOperate();
        exportOperate.export("test");
    }

}
