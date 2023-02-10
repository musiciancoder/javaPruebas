package solid.liskovprinciple.conliskov;

public class Video {

    private VideoManager manager;

    public double getNumberOfHoursPlayed(){
        return manager.getNumberOfHours();
    }

    public void playRandomAd() throws Exception {
        manager.playRandomAd();
    }
}
