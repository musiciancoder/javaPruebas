package ejercicios.iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {
        List<Integer>integerList = new LinkedList<>();
        integerList.add(34);
        integerList.add(50);
        integerList.add(60);
        integerList.add(4);

        Iterator<Integer> integerIterator = integerList.listIterator();
        while (integerIterator.hasNext()){
            if (integerIterator.next().equals(34)){
              //  integerIterator.next().set(40); //No se pueden modificar los valores (el metodo set no esta disponible)
            }

            if (integerIterator.next().equals(50)){
               // integerList.add(69); //arroja ConcurrentModificationException
                integerIterator.remove(); //esta es la unica modidicacion concurrente que SÍse puede hacer con iterador simple
            }

        }


        System.out.println(integerList);
    }
}
