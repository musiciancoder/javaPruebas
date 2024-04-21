package colecciones;


/*
Which collections are LIFO?
There's actually a Stack class: http://java.sun.com/j2se/1.5.0/docs/api/java/util/Stack.html

If you don't want to use that, the LinkedList class (http://java.sun.com/j2se/1.5.0/docs/api/java/util/LinkedList.html) has addFirst and addLast and removeFirst and removeLast methods, making it perfect for use as a stack or queue class.
 */

import java.util.LinkedList;
import java.util.List;

public class ListaEntrelazada2 {
    public static void main(String[] args) {
        List<String>list0=new LinkedList<>();
        System.out.println(list0.getClass());
        LinkedList<String>list=new LinkedList<>();
        list.add("Claudio");
        list.add("Edgardo");
        list.add("Andres");
        list.addFirst("Adarita");
        list.addLast("Elizabeth");
        System.out.println(list);
        LinkedList<String>list2=new LinkedList<>(); //[Adarita, Claudio, Edgardo, Andres, Elizabeth] --> en orden FIFO
        for (int i = list.size()-1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2); //[Elizabeth, Andres, Edgardo, Claudio, Adarita]

        List<Integer>listInteger=new LinkedList<>();
        listInteger.add(4);
        listInteger.add(1);
        listInteger.add(9);
        listInteger.add(2);
        System.out.println(listInteger); //[4, 1, 9, 2] --> en orden FIFO

    }
}
