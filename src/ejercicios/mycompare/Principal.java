package ejercicios.mycompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Alexis","Sanchez","Dezensor", 33);
        Jugador jugador2 = new Jugador("Charles","Aranguiz","Mediocampista", 31);
        Jugador jugador3 = new Jugador("Paulo","Diaz","Defensor", 26);

        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);

        Collections.sort(jugadores); //por edad por medio de Comparable

        System.out.println(jugadores);

        int micomparacionA = jugador2.compare(jugador2,jugador1);
        int micomparacionB = jugador2.compare(jugador3,jugador1);

        System.out.println(micomparacionA);
        System.out.println(micomparacionB);

    }
}
