package colecciones.mymap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {

        Map <String,String> personas = new TreeMap<>();
        personas.put("Zelma","Bouvier");
        personas.put("Andres","Diaz"); //lo agrega, pero luego lo saca, ya q si tiene jkeys repetidos se queda siempre con el ultimo
        personas.put("Andres","Weldt");
        personas.put("Claudio","Diaz");
        personas.put("Nulo",null); //TreeMap doesn’t allow a null key but may contain many null values.

        System.out.println(personas); //{Andres=Weldt, Claudio=Diaz, Nulo=null, Zelma=Bouvier} devuelve ordenado por orden alfabetico de keys


        TreeMap <String,String> personas2 = new TreeMap<>();
        personas2 = (TreeMap<String, String>) personas;
        personas2.put("Edgardo","Diaz");
        personas2.put("Lee","Walbaum");
        personas2.put("Ariel","Zabaleta");
        personas2.descendingKeySet();
        System.out.println(personas2);
        personas2.navigableKeySet();
        System.out.println(personas2);
        personas2.descendingMap();
        System.out.println(personas2);


    }
}
