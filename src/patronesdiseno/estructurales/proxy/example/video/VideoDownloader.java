package patronesdiseno.estructurales.proxy.example.video;


//Esta es la ServiceInterface.
//Gringo dijo:"this interface is that of the service, and the proxy must follow this interface to be able to disguise itself as a service object"

public interface VideoDownloader {

    Video getVideo(String videoName);

}