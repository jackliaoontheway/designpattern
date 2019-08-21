package behavioral.mediator.DeepThinking.casedemo;

public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showVideo(String videoData) {
        System.out.print(videoData);
    }

}
