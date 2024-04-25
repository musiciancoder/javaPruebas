package colecciones.mysets;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

/*
Tiene los mismos métodos que List, aunque no implementa a List, sino q esta en el mismo niverl jerárquico. A diferencia de List, no admite duplicados

A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. As implied by its name, this interface models the mathematical set abstraction.
The Set interface places additional stipulations, beyond those inherited from the Collection interface, on the contracts of all constructors and on the contracts of the add, equals and hashCode methods. Declarations for other inherited methods are also included here for convenience. (The specifications accompanying these declarations have been tailored to the Set interface, but they do not contain any additional stipulations.)
The additional stipulation on constructors is, not surprisingly, that all constructors must create a set that contains no duplicate elements (as defined above).

Note: Great care must be exercised if mutable objects are used as set elements. The behavior of a set is not specified if the value of an object is changed in a manner that affects equals comparisons while the object is an element in the set. A special case of this prohibition is that it is not permissible for a set to contain itself as an element.
Some set implementations have restrictions on the elements that they may contain. For example, some implementations prohibit null elements, and some have restrictions on the types of their elements. Attempting to add an ineligible element throws an unchecked exception, typically NullPointerException or ClassCastException. Attempting to query the presence of an ineligible element may throw an exception, or it may simply return false; some implementations will exhibit the former behavior and some will exhibit the latter. More generally, attempting an operation on an ineligible element whose completion would not result in the insertion of an ineligible element into the set may throw an exception or it may succeed, at the option of the implementation. Such exceptions are marked as "optional" in the specification for this interface.
 */
public class SetYSusMetodos {

    public static void main(String[] args) {


        Set<String> set = new HashSet<>(); //first in, first out
        set.add("Tomy");
        set.add("Adarita");
        set.add("Nina");
        //  set.get(0); , ojo que los sets no tienen indices, por lo q esto no se puede!!!!!!--> se explica como solucionar esto en clase HashSetYSusMetodos
        System.out.println(set); //[Tomy, Adarita, Nina]-->los devuelve en orden FIFO


        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(7);
        setInteger.add(9);
        setInteger.add(2);
        setInteger.add(4);
        System.out.println(setInteger); //[2, 4, 7, 9] -->los devuelve en orden cresciente

        //  Podemos concluir q el hashset devuelve los strings en orden de entrada y los integers en orden cresciente (igual esto no es muy confiable).
        //  Si queremos asegurar un orden sin valores repetidos usar TreeSet, no HashSet


        //SplitIterator --> las listas tambien lo tienen, pero los Map no lo tienen!! Tiene mejor performance q Iterator y aguanta programacion concurrente

        // Getting Spliterator
        Spliterator<String> namesSpliterator = set.spliterator();

        // Traversing elements
        namesSpliterator.forEachRemaining(System.out::println);

    }
}
