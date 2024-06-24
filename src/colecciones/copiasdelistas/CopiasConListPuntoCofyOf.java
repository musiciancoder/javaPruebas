package colecciones.copiasdelistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopiasConListPuntoCofyOf {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Fender");
        list.add("Gibson");
        List<String> list2 = List.copyOf(list); //crea un shallow copy, pero a diferencia de los demas casos la copia no es modificable
        list.add("PRS");
        System.out.println(list2);
      //  list2.add("Ibanez"); //.UnsupportedOperationException --> no permite modificar la lista
      //  System.out.println(list2);

    }
}
