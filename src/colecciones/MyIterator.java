package colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyIterator {

    public static void main(String[] args) {

        List<Integer>list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        Iterator<Integer>it= list.iterator();
        int num;
        while (it.hasNext()){
            num = it.next();

            it.remove(); //notar q con un iterador se puede modificar en cada iteracion, lo que no se puede hacer con un bloque for o foreach
            System.out.println(list);
        }

    }
}
