package solid.openclosed.conopenclosed;

/*Ahora cada una de las clases esta cerrada a modificacion.Si agregamos otro enum simplemente creamos otra de estas clases q implementan la interfaz*/
public class EducarionalEarningsCalculator implements IEarningCalculator{
    @Override
    public double calculateEarnings(Video video) {
        return video.getLikes() * 0.013 + video.getViews()*0.0013;
    }
}
