package colecciones.mymap.myabstractmap;

// Java Program to demonstrate adding
// elements to the AbstractMap

import java.util.*;

public class AddElements {

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
        absMap.put(3, "an");
        absMap.put(4, "AbstractMap");

        // Displaying the mappings using
        // entrySet() to get the set view
        System.out.println("The Set view of the mappings:");
        System.out.println(absMap.entrySet());
    }
}
/*
The Set view of the mappings:
[1=This, 2=is, 3=an, 4=AbstractMap]
 */