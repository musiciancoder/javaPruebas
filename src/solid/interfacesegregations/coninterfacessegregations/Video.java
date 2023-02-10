package solid.interfacesegregations.coninterfacessegregations;

public class Video implements IVideoActions, IAdsActions{
    @Override
    public void playRandomAd() {

    }

    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }
}
