package solid.openclosed.conopenclosed;

public class EntertainmentEarningsCalculator implements  IEarningCalculator{
    @Override
    public double calculateEarnings(Video video) {
        return video.getLikes() * 0.011 + video.getViews()*0.0011;
    }
}
