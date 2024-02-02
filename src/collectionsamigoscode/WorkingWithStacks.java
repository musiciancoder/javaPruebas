package collectionsamigoscode;

/*
The Stack class represennts a last-in-first-out (LIFO) stack of objects. Works as a box of pringles
It is syncronized, which means they are thread safe. Arraylists and linkedlist are not syncrchonized.
It extends class Vector with five operations that allow a vector to be treated as a stack
The usual pusk and pop operations are provided as well as a method to peek at the top item on the stack,
a method to test for wheater the stack is empty
and a method to search the stack for an item and discover how far it is from the top
*/

import java.util.Stack;

public class WorkingWithStacks {

    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.add(40); //this also works well because it extends AbstractList which implements List
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.capacity());

    }
}
