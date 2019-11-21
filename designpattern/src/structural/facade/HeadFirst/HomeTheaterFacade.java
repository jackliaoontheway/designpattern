package structural.facade.HeadFirst;

public class HomeTheaterFacade {

    private Amplifer amp;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade() {

    }

    /**
     * 对于客户端来说，不需要知道实现看电影的具体细节，只需要调用看电影即可
     * @param movie
     */
    public void watchMovie(String movie) {
        //amp.on();
        //tuner.on();
        //dvdPlayer.on();
        //projector.on();
        //screen.on();
    }

    public void endMovie(String movie) {
        //amp.off();
        //tuner.off();
        //dvdPlayer.off();
        //projector.off();
        //screen.off();
    }


}
