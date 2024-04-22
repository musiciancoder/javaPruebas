package arraycollectionstring;

import java.util.*;
import java.util.stream.Collectors;

public class ListaDeStringsAListaDeInteger {

    public static void main(String[] args) {
        int num = 149257;
        String str = String.valueOf(num);
        List<String> myList = new ArrayList<>(Arrays.asList(str.split("")));
        List<Integer> listOfInteger = myList.stream().map(a -> Integer.parseInt(a)).collect(Collectors.toList()); //tambien esta disponible el Collectors.toSet() y el Collectors.toUnmodifiableList()
        int[] arr = listOfInteger.stream().mapToInt(i -> i).toArray(); //tambien disponible el mapToDouble, mapToLong, flatMapToDouble, etc
        for (int i:
            arr ) {
            System.out.println(i);
        }
        List<String>list = listOfInteger.stream().map(l->String.valueOf(l)).collect(Collectors.toList()); //list belongs to class: class java.util.ArrayList
        System.out.println(list); //[1, 4, 9, 2, 5, 7] -->los devuelve en orden FIFO
        System.out.println("list belongs to class: " + list.getClass());
        Set<String> set= listOfInteger.stream().map(l->String.valueOf(l)).collect(Collectors.toSet()); //set belongs to class: class java.util.HashSet
        System.out.println(set);  //[1, 2, 4, 5, 7, 9] -->los devuelve en orden cresciente
        System.out.println("set belongs to class: " + set.getClass());

    }
}