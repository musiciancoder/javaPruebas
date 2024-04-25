package colecciones.myvectors;

import java.util.Stack;
import java.util.Vector;

public class MyVector {

    //Implements List Interface
    //Admits duplicates.
    //Vector is a Class and stack extends this interface. Both are syncronized (thread protected)
    //Works as a prinkle box ???-->esto me causa ruido !!

    public static void main(String[] args) {
        Vector <String> myVector = new Vector<>(); //En general la clase Vector tiene los mismos métodos q una List porque hereda indirectamenta de esta (hereda de AbstarctList), pero a diferencia de las listas, Vector es syncronized
        myVector.add("Andres");
        myVector.add("Maira");
        myVector.add("Claudito");
        myVector.add("Maira");
        myVector.add("Claudito");  //Admits duplicates.
       // myVector.remove(); no se puede, debe obligatoriamente pasarse un argumento (objeto o indice);
      //  String cero= myVector.get(0); //esto es posible, por lo tanto sí existen los indices en los vectores
        System.out.println("myVector: " + myVector); //[Andres, Maira, Claudito, Maira, Claudito]
        System.out.println("size: " + myVector.size());
        System.out.println("class: " + myVector.getClass());//class java.util.Vector
        System.out.println("capacity: " + myVector.capacity());//10






        //De Vector a Stack

        // myVector.peek(); //notar q no esta disponible

        //Casting 1
       /* Stack <String> myStack= (Stack) myVector; //este casting da un error
      myStack.peek(); // notar q ahora sí esta disponible
       */

        //Casting 2
        Vector<String>vector= new Stack<>();
        System.out.println("Class of object vector: " + vector.getClass()); //Class of object vector: class java.util.Stack
        vector.add("silla");
        vector.add("mesa");
      //  vector.peek(); //notar q no esta disponible porq peek() pertenece a Stack, no a Vector
        Stack<String>stack2= (Stack<String>) vector; //este casting sí esta permitido, porque  declaramos el objeto vector por polimorfismo
       // stack2.peek(); //notar q para stack2 sí esta disponible !!
        System.out.println("staxk2: " + stack2);





    }


}
