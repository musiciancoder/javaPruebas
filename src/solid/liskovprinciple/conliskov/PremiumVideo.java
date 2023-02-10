package solid.liskovprinciple.conliskov;

public class PremiumVideo {

    private int premiumId;
    private VideoManager manager;

    public double getNumberOfHoursPlayed(){
        return manager.getNumberOfHours();
    }
}
