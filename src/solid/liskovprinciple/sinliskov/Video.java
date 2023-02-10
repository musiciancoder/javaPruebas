package solid.liskovprinciple.sinliskov;

import lombok.Data;

@Data
public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;


    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }

    public  void playRandomAd() throws Exception {
        //play an ad
        System.out.println("Play one add");
    }


}