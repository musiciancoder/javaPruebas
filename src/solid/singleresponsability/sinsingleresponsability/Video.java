package solid.singleresponsability.sinsingleresponsability;

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


    //Esta clase tienen dos funcionalidades q no se relacionan entre si, violando single responsability

    public  double getNumberOfHoursPlayed(){
        return (time/3600.0)*views;
    }

    public void persist() throws SQLException {
        String url ="jdbc:mysql://localhost:3306/youtube";
        Connection conn = DriverManager.getConnection(url,"root","");
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO Video (Title, Time, Likes, Views) VALUES (" + title + "," + time + "," + likes + "," + views +  ")";
        stmt.executeUpdate(sql);
    }
}
