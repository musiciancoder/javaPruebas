package colecciones.mymap.myabstractmap;

// Java Program to demonstrate removing
// elements from the AbstractMap

import java.util.*;

public class RemoveElements {

    public static void main(String[] args)
    {
        // Since AbstractMap is an abstract class
        // create object using HashMap
        AbstractMap<Integer, String> absMap
                = new HashMap<Integer, String>();

        absMap.put(1, "This");
        absMap.put(2, "is");
        absMap.put(3, "an");
        absMap.put(4, "AbstractMap");

        // Displaying the mappings
        System.out.println("Mappings of the AbstractMap:");
        System.out.println(absMap);

        // Removing an entry using the remove() method
        absMap.remove(1);

        // Displaying the mappings
        System.out.println("Mappings of the AbstractMap:");
        System.out.println(absMap);

        // Clearing the whole map using clear()
        absMap.clear();

        // Displaying the mappings
        System.out.println("\nThe Set view of the mappings:");
        System.out.println(absMap);
    }
}
 /*
 Output
Mappings of the AbstractMap:
{1=This, 2=is, 3=an, 4=AbstractMap}
Mappings of the AbstractMap:
{2=is, 3=an, 4=AbstractMap}

The Set view of the mappings:
{}
  */