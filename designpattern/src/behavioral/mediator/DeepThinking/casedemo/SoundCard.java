package behavioral.mediator.DeepThinking.casedemo;

public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String soundData) {
        System.out.println("sound  : " + soundData);
    }

}
