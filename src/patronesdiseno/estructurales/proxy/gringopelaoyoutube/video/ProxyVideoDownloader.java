package patronesdiseno.estructurales.proxy.gringopelaoyoutube.video;

import java.util.HashMap;
import java.util.Map;

//Este es el Proxy
//Gringo dijo:"The Proxy has a reference field that points to a service object;
// after the proxy finishes the work it was intended to do, usually, it passes the request to the service"

public class ProxyVideoDownloader implements VideoDownloader {

    //esta clase proxy en esta caso esta añadiendo una funcionalidad, (de la misma forma q un gateway agregaría una funcionalidad (como filtros, firewall o caché): que lo que ya se descargó que quede en el caché del proxy
    private final Map<String, Video> videoCache = new HashMap<>();
    private final VideoDownloader downloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        if (!videoCache.containsKey(videoName)) {
            videoCache.put(videoName, downloader.getVideo(videoName)); //acá lo está pasando al servicio o RealSubject
        }
        System.out.println("Retrieving video from cache...");
        System.out.println("-----------------------");
        return videoCache.get(videoName);
    }

}