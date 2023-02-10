package solid.interfacesegregations.sininterfacesegregations;

public class Video implements IVideoActions{
    @Override
    public double getNumberOfHoursPlayed() {
        return 1;
    }

    @Override
    public void playRandomAd() {

    }
}
