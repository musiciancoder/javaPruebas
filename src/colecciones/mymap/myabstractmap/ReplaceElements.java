package colecciones.mymap.myabstractmap;

// Java Program to demonstrate replacing
// elements of AbstractMap

import java.util.AbstractMap;
import java.util.HashMap;

public class ReplaceElements {

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

        // Displaying the mappings
        System.out.println("Mappings of the AbstractMap:");
        System.out.println(absMap);

        // Replacing the mapping associated to 3
        absMap.replace(3, "an");

        // Displaying the mappings
        System.out.println("\nMappings of the AbstractMap:");
        System.out.println(absMap);
    }
}

/*
Output
Mappings of the AbstractMap:
{1=This, 2=is, 3=a, 4=AbstractMap}

Mappings of the AbstractMap:
{1=This, 2=is, 3=an, 4=AbstractMap}
 */