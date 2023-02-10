package solid.singleresponsability.consingleresponsability;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Data
public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;



    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }

}