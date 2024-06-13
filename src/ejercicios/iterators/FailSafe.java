package ejercicios.iterators;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

    public static void main(String[] args) {


        CopyOnWriteArrayList<Integer>coral =new CopyOnWriteArrayList<>(); //Hay CopyOnWriteArraySet, pero no  CopyOnWriteArrayLinkedlist
        coral.add(45);
        coral.add(78);
        coral.add(89);
        coral.add(6);

        Iterator<Integer> integerIterator = coral.listIterator();
        while (integerIterator.hasNext()){
            if (integerIterator.next().equals(78)){
                coral.add(69); //Notar que NO arroja ConcurrentModificationException

              //  integerIterator.remove(); // UnsupportedOperationException
            }
        }
        System.out.println(coral);


    }
}