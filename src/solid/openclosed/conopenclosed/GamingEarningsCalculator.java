package solid.openclosed.conopenclosed;

public class GamingEarningsCalculator implements IEarningCalculator{
    @Override
    public double calculateEarnings(Video video) {
        return video.getLikes() * 0.012 + video.getViews()*0.0012;

    }
}
