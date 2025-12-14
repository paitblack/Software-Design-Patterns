package Facade;

public class HomeTheaterFacade {

    private PopcornPopper popper = new PopcornPopper();
    private Lights lights = new Lights();
    private Screen screen = new Screen();
    private Projector projector = new Projector();
    private Amplifier amplifier = new Amplifier();
    private DVDplayer dvdPlayer = new DVDplayer();

    public void watchMovie(String movie) {
        popper.on();
        lights.dim();
        screen.down();

        projector.on();
        projector.setInput("DVD");
        projector.wideScreen();

        amplifier.on();
        amplifier.setVolume(9);

        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
    }

    public void LoungeMusicMood() {
    }

    public PopcornPopper getPopper() {
        return popper;
    }

    public Lights getLights() {
        return lights;
    }

    public Screen getScreen() {
        return screen;
    }

    public Projector getProjector() {
        return projector;
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public DVDplayer getDvdPlayer() {
        return dvdPlayer;
    }
}
