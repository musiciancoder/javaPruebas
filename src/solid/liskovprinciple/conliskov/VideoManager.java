package solid.liskovprinciple.conliskov;

public class VideoManager {


    private String title;
    private int time;
    private int likes;
    private int views;


    public double getNumberOfHours() {
        return (time / 3600.0) * views;
    }

    public  void playRandomAd() throws Exception {
        //play an ad
        System.out.println("Play one add");
    }
}
