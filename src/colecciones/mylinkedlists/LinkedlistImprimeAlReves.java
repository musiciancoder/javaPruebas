package colecciones.mylinkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistImprimeAlReves {

    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList<>();

        linkedList.add("fender");
        linkedList.add("aria");
        linkedList.add("gibson");
        System.out.println(linkedList);
        LinkedList <String> linkedList2 = new LinkedList<>();
        Iterator <String> it = linkedList.iterator();

        while (it.hasNext()){
            linkedList2.addFirst(it.next());
        }
        System.out.println(linkedList2);
    }
}
