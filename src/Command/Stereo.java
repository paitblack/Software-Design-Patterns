package command;

public class Stereo {

    int volume = 5;
    public void on(){
        System.out.println("turning on the stereo");
    }

    public void off(){
        System.out.println("turning off the stereo");
    }

    public void setCD(){
        System.out.println("Setting CD");
    }

    public void setVolume(int vol){
        System.out.println("vol = " + vol);
        volume = vol;
    }
}
