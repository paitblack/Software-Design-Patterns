package Facade;

public class DVDplayer {
    public void on(){
        System.out.println("Turning on DVD Player");
    }

    public void play(String movie){
        System.out.println("Playing movie " + movie);
    }
}
