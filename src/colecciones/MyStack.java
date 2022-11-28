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
        System.out.println(myVector);

        System.out.println(myVector.capacity());
        myVector.remove(1);
        System.out.println(myVector.get(1));
        System.out.println(myVector.size());

        myVector.add("Claudito");
        System.out.println(myVector);
        System.out.println(myVector.size());
        System.out.println(myVector.getClass());//stack
       Stack mystack = (Stack) myVector;

        myVector.add("Lee");
        System.out.println(mystack.peek()); //first in first out

        System.out.println( mystack.getClass());
        System.out.println(myVector.getClass());




    }


}
