package colecciones.colas;

import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {
        //declaring priority queue q of string type

        PriorityQueue<String> p = new PriorityQueue<>();
        // inserting elements into the priority queue

        p.add("Life");
        p.add("is");
        p.add("Coding");
        System.out.println("Priority Queue is " + p); //FILO (first-in, last out, a diferencia de Queue que es FIFO)

        PriorityQueue <Integer> p2 = new PriorityQueue<>();
        p2.add(5);
        p2.add(7);
        p2.add(1);
        p2.add(8);
        System.out.println("Priority Queue is: " + p2);
        int i = p2.poll(); //el metodo poll() tambien esta disponible en las Queue
        System.out.println("Head element: " +i);
        System.out.println("Queue after polling head element: "+p2);
        p2.remove();
        System.out.println("Queue after removing head element: "+p2);
        // p2.get(4) //no se puede en que ni en priority queue

    }

}
