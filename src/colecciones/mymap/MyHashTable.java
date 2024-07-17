package colecciones.mymap;

import java.util.AbstractMap;
import java.util.Hashtable;
import java.util.Map;

public class MyHashTable { //No hereda ni de Map, pero no de AbstractMap como las otras

    /*
    The java.util.Hashtable class is a class in Java that provides a key-value data structure, similar to the Map interface. It was part of the original Java Collections framework and was introduced in Java 1.0.

However, the HashTable class has since been considered obsolete and its use is generally discouraged. This is because it was designed prior to the introduction of the Collections framework and does not implement the Map interface, which makes it difficult to use in conjunction with other parts of the framework. In addition, the Hashtable class is synchronized, which can result in slower performance compared to other implementations of the Map interface.
     */

    public static void main(String[] args) {

        Map<String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
      //  numbers.put("three", 33); no acepta valores duplicados de keys
        numbers.put(" ",4);
       // numbers.put("nulo", null); //no acepta
      //  To retrieve a number, use the following code:

        for (Map.Entry<String,Integer> m: numbers.entrySet()
             ) {
            String key = m.getKey();
            Integer value = m.getValue();
            System.out.println("Key: ".concat(key).concat(", Value: ") + value);
        }

        Integer n = numbers.get(" ");
        if (n != null) {
            System.out.println(" " + n);
        }
    }
}
