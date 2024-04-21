package colecciones;

import java.util.HashSet;
import java.util.Set;

public class MySet {



    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); //first in, first out
        set.add("Tomy");
        set.add("Adarita");
        set.add("Nina");
      //  set.get(0); , ojo que los sets no tienen indices !!
        System.out.println(set); //[Tomy, Adarita, Nina]-->los devuelve en orden FIFO

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(7);
        setInteger.add(9);
        setInteger.add(2);
        setInteger.add(4);
        System.out.println(setInteger); //[2, 4, 7, 9] -->los devuelve en orden cresciente

      //  Podemos concluir q el hashset devuelve los strings en orden de entrada y los integers en orden cresciente (igual esto no es muy confiable).
        //  Si queremos asegurar un orden sin valores repetidos usar TreeSet, no HashSet
    }
}
