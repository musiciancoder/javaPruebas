package solid.openclosed.sinopenclosed;

/*Si tuvieramos que agregar otro enum (sports, por ejemplo) tendríamos q modificar esta clase,  lo q contradice el "closed to modifications"
*/
public class EarningsCalculator {

    public double calculateEarnings(Video video){
        return switch (video.getCategory()){
            case EDUCATIONAL -> calculateEducationalEarnings(video);
            case GAMING -> calculateGamingEarnings(video);
            case ENTERTAINMENT -> calculateEntertainmentEarnings(video);
        };
    }

    public double calculateEducationalEarnings(Video video){
        return video.getLikes() * 0.013 + video.getViews()*0.0013;
    }

    public double calculateGamingEarnings(Video video){
        return video.getLikes() * 0.012 + video.getViews()*0.0012;
    }

    public double calculateEntertainmentEarnings(Video video){
        return video.getLikes() * 0.011 + video.getViews()*0.0011;
    }




}
