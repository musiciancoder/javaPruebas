package colecciones.copiasdelistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopiasConCollectionsPuntoCopy {
    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> dest = new ArrayList<>(Arrays.asList(4,5,6));
        Collections.copy(dest, source); //Crea un shallow copy si o si borra todos los elementos de dest.
        System.out.println("source: " + source);
        System.out.println("dest: " + dest);
        System.out.println(" ");
        source.add(7); //
        dest.add(8); //
        System.out.println("source: " + source);
        System.out.println("dest: " + dest);
    }
}
