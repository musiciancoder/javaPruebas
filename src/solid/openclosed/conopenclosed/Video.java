package solid.openclosed.conopenclosed;

import lombok.Data;

@Data
public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;
    private Category category;


    public  double getNumberOfHoursPlayed(){
        return (time/3600.0)*views;
    }

    enum Category { //con el @Data tb creamos getter y setter para Category
        GAMING, EDUCATIONAL, ENTERTAINMENT //aqui sí podria ir otra categoría, como SPORTS por ejemplo, que indicaría si es futbol, basquetball, etc.
    }


}
