package patronesdiseno.estructurales.proxy;

import patronesdiseno.estructurales.proxy.gringopelaoyoutube.internet.Internet;
import patronesdiseno.estructurales.proxy.gringopelaoyoutube.internet.ProxyInternet;
import patronesdiseno.estructurales.proxy.gringopelaoyoutube.video.ProxyVideoDownloader;
import patronesdiseno.estructurales.proxy.gringopelaoyoutube.video.VideoDownloader;


/*El patron proxy permite tener mayor control sobre el objeto de una clase, al realizar alguna accion antes o despues que la petición alcance ese objeto, de la misma forma que un dispositivo como gateway o un proxy server actuarían para realizar alguna accion antes o despues de que una peticion (http normalmente) llegue a nuestra maquina
Además maneja el ciclo de vida del servicio, y el proxy funcionará incluso si el objeto del servicio no se encuentra disponible
La clase Proxy debe implementar alguna interfaz que tambien sea implementada por la clase de servicio original
 Se pueden introducir nuevos proxies segun requerimientos de funcionalidad (filtros, seguridad o caché por ejemplo) sin necesidad de modificar el servicio o el cliente, por lo q se cumple el principio Open-Closed.
 */


//Este es el cliente

//Gringo dijo: "the client should work with the interface (Internet, VideoDownloader), by doing so, he can pass a proxy object
// (ProxyInternet, ProxyVideoDownloader) to a code that expects a service object"

public class MainApp {

    /*
     * Video Reference: https://youtu.be/TS5i-uPXLs8
     */
    public static void main(String[] args) {

        //now, the user who wants to benefit from the banned-websites functionality can use the proxy without affecting other users
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");//downloaded
        videoDownloader.getVideo("geekific"); //cache
        videoDownloader.getVideo("likeNsub");//downloaded
        videoDownloader.getVideo("likeNsub"); //cache
        videoDownloader.getVideo("geekific");//cache

    }

}