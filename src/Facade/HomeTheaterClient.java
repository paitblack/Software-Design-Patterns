package Facade;

public class HomeTheaterClient {

    public static void main(String[] args) {
        HomeTheaterFacade htf = new HomeTheaterFacade();

        htf.watchMovie("Scarface");
        htf.endMovie();
        htf.LoungeMusicMood();
    }
}
