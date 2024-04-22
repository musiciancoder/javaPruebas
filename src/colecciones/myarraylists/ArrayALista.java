package colecciones.myarraylists;

import java.util.Arrays;
import java.util.List;

public class ArrayALista {

    public static void main(String[] args) {
        List<String> personas = Arrays.asList("Andres", "Edgardo", "Claudio");
       // An alternative in Java 8:
        String[] strings = personas.toArray(String[]::new);
        for (String p:strings
             ) {
            System.out.println(p);
        }
      //  Since Java 11:
       // String[] strings2 = personas.toArray(String[]::new);
    }
}
