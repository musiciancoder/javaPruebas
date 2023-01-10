package patronesdiseno.estructurales.proxy.example.video;

//Este es el Service

//Gringo dijo: "this is the actual implementation of the interface; contains business logic"

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to https://www.youtube.com/");
        System.out.println("Downloading Video");
        System.out.println("Retrieving Video Metadata");
        return new Video(videoName);
    }

}