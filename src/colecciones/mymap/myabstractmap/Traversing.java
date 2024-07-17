package colecciones.mymap.myabstractmap;

// Java Program to demonstrate
// traversing AbstractMap

import java.util.*;

public class Traversing {

    public static void main(String[] args)
    {
        // Since AbstractMap is an abstract class
        // create object using HashMap
        AbstractMap<Integer, String> absMap
                = new HashMap<Integer, String>();

        // Adding values to the AbstractMap
        // Note that we do not create an object of
        // AbstractMap
        absMap.put(1, "This");
        absMap.put(2, "is");
        absMap.put(3, "a");
        absMap.put(4, "AbstractMap");

        // METHOD 1
        // Iterate over the map using entrySet()
        // which returns a collection view of the map

        System.out.println("Using the entrySet() method");

        for (AbstractMap.Entry<Integer, String> entry :
                absMap.entrySet()) {
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
        }

        // METHOD 2
        // Iterate over the map using the Iterator interface

        System.out.println(
                "\nUsing the Iterator interface");

        Iterator<Integer> itr = absMap.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            System.out.println("Key = " + key
                    + ", Value = "
                    + absMap.get(key));
        }
    }
}
