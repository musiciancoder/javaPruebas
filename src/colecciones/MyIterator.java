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

            it.remove();
            System.out.println(list);
        }

    }
}
