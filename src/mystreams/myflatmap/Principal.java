package mystreams.myflatmap;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Persona p = new Persona("pedro");
        Viaje v = new Viaje("Francia");
        Viaje v2 = new Viaje("Inglaterra");
        p.addViaje(v);
        p.addViaje(v2);
        Persona p1 = new Persona("gema");
        Viaje v3 = new Viaje("Italia");
        Viaje v4 = new Viaje("Belgica");
        p1.addViaje(v3);
        p1.addViaje(v4);
        List< Persona > lista = new ArrayList< Persona >();
        lista.add(p);
        lista.add(p1);



        lista.stream(). //pasamos la lista de personas a stream
                map(persona -> persona.getLista())//pasamos cada persona a la lista de viajes que tiene esta persona
                //en este punto tenemos una lista de personas y c/u de ellas tiene una lista de viajes o sea una estructura anidada. Notar que en este punto solo tenemos la lista de personas como stream,
                //pero no la lista de viajes. Para lograr tambien tener lista de viajes como stream debemos hacer uso de flatmap en la linea siguiente
                .flatMap(viajes -> viajes.stream())
                .map(viaje -> viaje.getPais()).forEach(System.out::println);//pasamos cada viaje a pais
    }
}
