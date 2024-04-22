package colecciones.mylinkedlists;


/*
Which collections are LIFO?
There's actually a Stack class: http://java.sun.com/j2se/1.5.0/docs/api/java/util/Stack.html

If you don't want to use that, the LinkedList class (http://java.sun.com/j2se/1.5.0/docs/api/java/util/LinkedList.html) has addFirst and addLast and removeFirst and removeLast methods, making it perfect for use as a stack or queue class.
 */

import java.util.*;

public class ListaEntrelazada2 {
    public static void main(String[] args) {
        LinkedList<String>list0=new LinkedList<>(); //sí acepta duplicados
        list0.add(0,"Lee");
        list0.add(1,"Lee");
        System.out.println("list0: " + list0);
        System.out.println("Clase: " + list0.getClass()); //class java.util.LinkedList
        LinkedList<String>list=new LinkedList<>();
        list.add("Claudio");
        list.add("Edgardo");
        list.offer("Andres"); //igual a add(). According to the docs the main difference is that when the operation fails, one (add) throws an exception and the other (offer) returns a special value (false):
         list.addFirst("Adarita"); //este metodo no lo tiene ArrayList
        list.addLast("Elizabeth"); //este metodo no lo tiene ArrayList
       // list.getFirst(); //este metodo no lo tiene ArrayList
       // list.getLast(); //este metodo no lo tiene ArrayList
        System.out.println(list); //[Adarita, Claudio, Edgardo, Andres, Elizabeth] --> en orden FIFO
        //Ninguno de los siguientes tres metodos estan en ArrayList
        //Diferencia entre poll() y pop(): Returning null + removing operations: poll() docs. Throwing exception + removing operations: pop()docs
        list.pop(); //saca a Adarita
        list.poll();//saca a Claudio.
        // list.remove(); //tambien esta disponible, al igual q para arraylist. Recordar que poll() Blocks until an element becomes available for removal; remove() does not block. https://www.geeksforgeeks.org/difference-between-poll-and-remove-method-of-queue-interface-in-java/
      //Todos los siguientes no estan disponibles en ArrayList
        //list.removeFirst;
        //list.removeLast;
       // removeFirstOccurrence(Object o);
       // removeLastOccurrence(Object o);
        list.push("Queeny"); //Mete a Queeny al comienzo
        System.out.println("List after push and pop:  " + list); //



        //Para imprimir al reves (primera forma)
     /*   Collections.reverse(list);
        System.out.println(list); //[Elizabeth, Andres, Edgardo, Claudio, Adarita]

      */

        //Para imprimir al reves (segunda forma)
        LinkedList<String>list2=new LinkedList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2); //[Elizabeth, Andres, Edgardo, Claudio, Adarita]
        System.out.println("First element: " + list2.getFirst()); //para obtener el primer elemento, pero no lo elimina. getLast() funciona de la misma forma.este metodo no lo tiene ArrayList
        System.out.println("Element: " + list2.element()); //no kcho cual es la diferenci con respecto al metodo anterior
        System.out.println(" ");





        //Lista de integer
        LinkedList<Integer>listInteger=new LinkedList<>();
        listInteger.add(4);
        listInteger.add(1);
        listInteger.add(9);
        listInteger.add(2);
        System.out.println(listInteger); //[4, 1, 9, 2] --> en orden FIFO

        //descending iterator, funciona en forma similar para Strings; este metodo no lo tiene ArrayList
        Iterator<Integer> dit = listInteger.descendingIterator();
        System.out.println("Descending iterator");
        while (dit.hasNext()){
            System.out.print(dit.next() + ", "); // 2, 9, 1, 4,
        }



        // ListIterator<Integer> it = listInteger.listIterator(); //iterador normal funciona bien igual que para arraylist

    }
}
