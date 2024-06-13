package colecciones.mylists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//https://docs.oracle.com/javase/8/docs/api/java/util/List.html
public class ListYSusMetodos {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);


        List<Integer> list2 = new LinkedList<>();
        list2.add(18);
        list2.add(19);
        list2.add(20);

        list.addAll(list2);

        System.out.println(list);

        List<Integer> list3 = new LinkedList<>();
        list3.add(15);
        list3.add(16);
        list3.add(17);

        list.addAll(3, list3); //inserta en posicion 3 de list

        System.out.println(list);

        System.out.println(list.containsAll(list3)); //retorna true si list contiene todos los elementos de la coleccion list3

        ListIterator <Integer> listIterator = list.listIterator(4); //desde el indice 4 en adelante, si no se pone indice lo toma desde el comienzo
        while (listIterator.hasNext())
            System.out.println(listIterator.next());

        list.removeAll(list3);

        System.out.println(list);

        list.retainAll(list2); //elimina todos menos los elementos de lis2

        System.out.println(list);

        List<Integer> list4 = new LinkedList<>(list.subList(1,2));

        System.out.println(list4);


    }
}
