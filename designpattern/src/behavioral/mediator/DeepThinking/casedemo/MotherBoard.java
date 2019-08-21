package behavioral.mediator.DeepThinking.casedemo;

public class MotherBoard implements Mediator {

    private CDDriver cDDriver;
    private CPU cpu;
    private SoundCard soundCard;
    private VideoCard videoCard;

    @Override
    public void changed(Colleague colleague) {
        if (colleague instanceof CDDriver) {
            this.openCDDriverReadData((CDDriver) colleague);
        } else if (colleague instanceof CPU) {
            this.openCPU((CPU) colleague);
        }
    }

    private void openCPU(CPU cpu) {
        String soundData = cpu.getSoundData();
        String videoData = cpu.getVideoData();
        this.soundCard.soundData(soundData);
        this.videoCard.showVideo(videoData);
    }

    private void openCDDriverReadData(CDDriver colleague) {
        String data = colleague.getData();
        this.cpu.executeData(data);
    }
}
