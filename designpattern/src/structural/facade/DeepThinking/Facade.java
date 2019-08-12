package structural.facade.DeepThinking;

public class Facade {

    AModuleApi aModuleApi;
    BModuleApi bModuleApi;
    CModuleApi cModuleApi;

    void operation() {
        aModuleApi.operation();
        cModuleApi.operation();
        bModuleApi.operation();
    }

}
