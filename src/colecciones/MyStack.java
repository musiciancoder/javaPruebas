package colecciones;

import mystreams.MyMap;

import java.util.Stack;
import java.util.Vector;

public class MyStack {


    //Admits duplicates.
    //Vector is the interface and stack implements this interface. Both are syncronized (thread protected)
    //Works as a prinkle box


    public static void main(String[] args) {
        Vector <String> myVector = new Stack<>();
        myVector.add("Andres");
        myVector.add("Maira");
        myVector.add("Claudito");
        myVector.add("Maira");
        System.out.println(myVector);
        System.out.println(myVector.get(0));



        myVector.add("Claudito");
        System.out.println(myVector);
        System.out.println(myVector.size());
        System.out.println(myVector.getClass());//stack
        myVector.add("Lee");
       Stack mystack = (Stack) myVector;
        System.out.println(mystack);
        //es como una caja de pringles, aunque imprime en primer lugar al que entro primero
        System.out.println("Indice 0... " + mystack.get(0)); //Andres, lo q significa q es first in first out para los indices
        System.out.println("Im peeking..." + mystack.peek()); //Lee, lo que es last in first out para peek().
        /*
        empty()	boolean	The method checks the stack is empty or not.
push(E item)	E	The method pushes (insert) an element onto the top of the stack.
pop()	E	The method removes an element from the top of the stack and returns the same element as the value of that function.
peek()	E	The method looks at the top element of the stack without removing it.
search(Object o)
         */

        System.out.println( mystack.getClass());
        System.out.println(myVector.getClass());




    }


}
