package solid.singleresponsability.consingleresponsability;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VideoDAO {

    //Acá estan separadas las funcionalidades
    public void persist(Video video) throws SQLException {

        String url ="jdbc:mysql://localhost:3306/youtube";
        Connection conn = DriverManager.getConnection(url,"root","");
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO Video (Title, Time, Likes, Views) VALUES (" + video.getTitle() + "," + video.getTime() + "," + video.getLikes() + "," + video.getViews() + ")";
        stmt.executeUpdate(sql);
    }
}
