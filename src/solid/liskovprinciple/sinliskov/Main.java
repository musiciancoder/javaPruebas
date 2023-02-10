package solid.liskovprinciple.sinliskov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
        List<Video>videos = new ArrayList<>();
        videos.add(new Video());
        videos.add(new PremiumVideo());
        for (Video video:videos
             ) {
            try {
                video.playRandomAd();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
