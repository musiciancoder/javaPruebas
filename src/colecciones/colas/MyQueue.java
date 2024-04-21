package colecciones.colas;

import java.util.LinkedList;
import java.util.Queue;


/*
Definition
A priority queue is the queue in which each of its elements has some priorities. The elements from the queue are removed based on their priorities.
Queue is an interface in Java that uses FIFO principle to remove its elements.

Types
Min priority queue and Max priority Queue.It has no type.

Structure
Each element in priority queue has priority.
The queue elements have no priority.
deQueue operation
Elements are removed on the basis of their highest priority.
Elements from the queue are removed in FIFO order.
Element ordering
It is an ordered queue making searching easy.
It is a randomly organized queue.

Complexity
It is difficult to implement a priority queue. It is a simple queue with easy implementation.

Syntax

PriorityQueue <data type> queue_name = new PriorityQueue<>();
Queue<data type> queue_name = new LinkedList<>();

Properties

Priority Queue inherits the methods of AbstractCollection, AbstractQueue, Object and Collection Class.
It uses queue interface and util package for implementing queue in Java.

Operation
It is not easy to enQueue and deQueue elements.
It is very easy to insert and remove elements.

Advantage
It is easy to deQueue the highest order element.
Queue does not waste memory and utilize it effectively.

Disadvantage

It takes more time in insertion and deletion of elements.
It has limited space and is not ordered.

deQueue and enQueue time complexity
O(log(n))
O(1)
 */

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // queue declaration
        q.add(5); //adding elements to the queue
        q.add(6);
        q.add(4);
        q.add(1);
        q.add(8); //Queue is an interface in Java that uses FIFO principle to remove its elements, just like lists


        System.out.println("Queue is" + q);
        System.out.println("Removing queue element: " + q.remove());
        System.out.println("Now the Queue is: " + q);
    }
}
