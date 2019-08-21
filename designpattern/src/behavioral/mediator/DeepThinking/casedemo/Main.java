package behavioral.mediator.DeepThinking.casedemo;

public class Main {

    public static void main(String[] args) {

        MotherBoard mediator = new MotherBoard();
        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard video = new VideoCard(mediator);
        SoundCard sound = new SoundCard(mediator);

        //将 CDDriver cpu videoCard soundCard set 到mediator

        cd.readCD();// 开始

    }

}
