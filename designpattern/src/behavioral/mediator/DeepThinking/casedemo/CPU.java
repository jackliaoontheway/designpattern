package behavioral.mediator.DeepThinking.casedemo;

public class CPU extends Colleague {

    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String videoData = "";

    private String soundData = "";

    public String getVideoData() {
        return this.videoData;
    }

    public String getSoundData() {
        return this.soundData;
    }

    public void executeData(String data) {
        String [] strings = data.split(",");
        this.videoData = strings[0];
        this.soundData = strings[1];
        this.getMediator().changed(this);
    }

}
