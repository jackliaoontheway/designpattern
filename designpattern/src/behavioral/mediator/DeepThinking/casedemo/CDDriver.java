package behavioral.mediator.DeepThinking.casedemo;


public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    private String data = "";

    public String getData() {
        return this.data;
    }

    public void readCD() {
        this.data = "data from CD,ready to play";
        this.getMediator().changed(this);
    }


}
