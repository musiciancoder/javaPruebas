package colecciones.colas;

import java.util.LinkedList;
import java.util.Queue;


/*
https://www.tutorialspoint.com/difference-between-priority-queue-and-queue-implementation-in-java
The queue is a linear data structure that inserts elements from the back and removes elements from the starting end of the queue.
 */

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // queue declaration
        q.add(5); //adding elements to the queue
        q.add(6);
        q.add(5);//takes duplicates
        q.add(4);
        q.add(1);
        q.add(8); //Queue is an interface in Java that uses FIFO principle to remove its elements, just like lists

        System.out.println("The class of q is:" + q.getClass());

        System.out.println("Queue is" + q);
        System.out.println("Size before: " + q.size());
        System.out.println("Removing queue element: " + q.remove());
        System.out.println("Now the Queue is: " + q);
        System.out.println("Size after: " + q.size());
    }
}
