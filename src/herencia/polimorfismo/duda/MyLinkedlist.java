package herencia.polimorfismo.duda;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedlist {

    public static void main(String[] args) {
        List<String>list = new LinkedList<>();
        System.out.println("list is class: " +list.getClass()); //list is class: class java.util.LinkedList
        LinkedList<String>linkedList = new LinkedList<>();
        System.out.println("linkedList is class: " + linkedList.getClass()); //linkedList is class:class java.util.LinkedList
         // list.addFirst("Fender"); // no se puede, y esta es la duda que se intenta resolver en la interfaz Guitar
        linkedList.addFirst("Fender"); // sí se puede

        //aanalisis de casting
        List<String>list2 = new LinkedList<>();
        list2.add("blanco");
        list2.add("rojo");
        LinkedList<String>linkedList2 = (LinkedList)list2; //sí se puede !!
        linkedList2.addFirst("negro");
        linkedList2.addLast("azul");
        System.out.println(linkedList2);

    }
}
