package ejercicios;

import java.util.*;

/*
Write a function that takes a queue of integers and reverses the order of the elements using only one additional queue.
 */
public class ReverseQueue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue <Integer>queue = new LinkedList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
           queue.add(scan.nextInt());
        }
        System.out.println(queue.getClass());
        Collections.reverse((List<?>) queue);

        System.out.println(queue);
        System.out.println(queue.getClass());
    }
}
