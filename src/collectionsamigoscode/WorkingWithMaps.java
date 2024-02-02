package collectionsamigoscode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    //A map connot contain duplicate keys. Values can be duplicated thou!!
    //Each map can map to al most one value
    //Accepts copies(clones) as well as equal objects

    //HashTable:Null not allowed;Syncronized
    //HashMap:NullAllowed
    //LinkedHashMap:Null Alloed,Slow
    //TreeMap:Sorted;NullNotAllowds

    public static void main(String[] args) {

        Map<Integer, Persono> map = new HashMap<>(); //default initial capacity = 16
        map.put(1, new Persono("Alex"));
        map.put(2, new Persono("Alex"));
        map.put(3, new Persono("Mariam"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);
        map.forEach((key, person) -> {
            System.out.println(key + "-" + person);
        });
        System.out.println(map.getOrDefault(3, new Persono("default")));
        System.out.println(map.values());

    }


    static class Persono {
        private String name;

        public Persono(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name: " + name;
        }


    }
}


