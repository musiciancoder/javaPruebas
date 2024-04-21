package arraycollectionstring;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListASetConStreams {

    public static void main(String[] args) {

        List<Integer>listOfInteger=new LinkedList<>();
        listOfInteger.add(1);
        listOfInteger.add(4);
        listOfInteger.add(9);
        listOfInteger.add(2);
        listOfInteger.add(5);
        listOfInteger.add(7);
        List<String> list = listOfInteger.stream().map(l->String.valueOf(l)).collect(Collectors.toList());
        System.out.println(list); //[1, 4, 9, 2, 5, 7] -->los devuelve en orden FIFO
        Set<String> set= listOfInteger.stream().map(l->String.valueOf(l)).collect(Collectors.toSet());
        System.out.println(set);  //[1, 2, 4, 5, 7, 9] -->los devuelve en orden cresciente. Recordar que el set devuelve los strings en orden de entrada y los integers en orden cresciente
        List<String> inmodifiableList = listOfInteger.stream().map(l->String.valueOf(l)).collect(Collectors.toUnmodifiableList());
        System.out.println(inmodifiableList); //[1, 4, 9, 2, 5, 7] -->los devuelve en orden FIFO
        Set<String> inmodifiableSet= listOfInteger.stream().map(l->String.valueOf(l)).collect(Collectors.toUnmodifiableSet());
        System.out.println(inmodifiableSet);  // [9, 7, 5, 4, 2, 1] -->los devuelve en orden aleatorio
    }
}
