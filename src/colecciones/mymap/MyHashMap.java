package colecciones.mymap;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MyHashMap { //HashMap hereda de la clase abstracta AbstractMap

    /*
entrySet() – returns a collection-view of the map, whose elements are from the Map.Entry class. The entry.getKey() method returns the key, and entry.getValue() returns the corresponding value
keySet() – returns all keys contained in this map as a Set
values() – returns all values contained in this map as a Set
     */


    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Vigier","Excalibur");
        map.put("Fender","Stratocaster");
        map.put("Gibson","SG");
        map.put("Nulo",null); // HashMap allows storing at most one null key and many null values.
    //    map.put("Fender","Telecaster"); no admite keys repetidos, de ser asi se queda con el último (o sea se quedaria con telecaster si descomentamos esta linea)



        //cuando queremos solo keys
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
            /*
            Fender: Stratocaster
           Vigier: Excalibur
           Gibson: SG
           Nulo: null
           A diferencia de TreeMap no devuelve ordenado por orden alfabetico de keys
             */
        }

        //cuando queremos solo values
        for (String value : map.values()) {
            System.out.println("value: " + value);
        }


       //Cuando queremos ambas
        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("Jackson",1);
        map2.put("Aria",2);
        for ( Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: ".concat(key).concat(", Value: ") + value);
        }

        // Java program to demonstrate
// getOrDefault(Object key, V defaultValue) method



            {

                // Create a HashMap and add some values
                HashMap<String, Integer> map3
                        = new HashMap<>();
                map3.put("a", 100);
                map3.put("b", 200);
                map3.put("c", 300);
                map3.put("d", 400);

                // print map details
                System.out.println("HashMap: " + map.toString());

                // provide key whose value has to be obtained
                // and default value for the key. Store the
                // return value in k
                int k = map3.getOrDefault("b", 500);
                int l= map3.get("b");
                int n = map3.getOrDefault("e", 500);

                // print the value of k returned by
                // getOrDefault(Object key, V defaultValue) method
                System.out.println("Returned Value k: " + k);
                System.out.println("Returned Value l: " + l);
                System.out.println("Returned Value n: " + n);
            }
        }






        //Ojo, se pueden usar iteradores tambien https://www.baeldung.com/java-iterate-map


    }

