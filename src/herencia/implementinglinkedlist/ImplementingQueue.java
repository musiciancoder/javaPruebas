package herencia.implementinglinkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementingQueue {

    public static void main(String[] args) {
        Queue<String>queue=new LinkedList<>();
        queue.add("Andres");
        queue.add("Claudio");
        queue.add("Edgardo");
        queue.offer("Im offer");

    }
}
