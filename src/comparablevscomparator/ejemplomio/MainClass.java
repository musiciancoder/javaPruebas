package comparablevscomparator.ejemplomio;

import java.util.*;

//En general usar PriorityQueue y Comparable cuando tengamos que ordenar segun atributos que sean numeros
//En general usar Arrays y Comparator cuando tengamos que ordenar segun atributos que sean stings
//Cuando haya que ordenar por ambos (numeros y strings), Seguir el ejemplo q esta en paquete "hackerrank.ordenarpornumeroystring"

/*
The class implements Serializable, Iterable<E>, Collection<E>, Queue<E> interfaces.

A few important points on Priority Queue are as follows:

PriorityQueue doesn’t permit null.
We can’t create a PriorityQueue of Objects that are non-comparable
PriorityQueue are unbound queues.
The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for the least value, the head is one of those elements — ties are broken arbitrarily.
Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in a java multithreading environment.
The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
It provides O(log(n)) time for add and poll methods.
It inherits methods from AbstractQueue, AbstractCollection, Collection, and Object class.
 */

public class MainClass {
    public static void main(String[] args) {
        ComparablePersona persona1 = new ComparablePersona("Andres",46);
        ComparablePersona persona2 = new ComparablePersona("Ibelys",30);
        ComparablePersona persona3 = new ComparablePersona("Juan Pablo",5);
        ComparablePersona persona4 = new ComparablePersona("Isabel",2);

        PriorityQueue<ComparablePersona> pq = new PriorityQueue<>();
        pq.add(persona1);
        pq.add(persona2);
        pq.add(persona3);
        pq.add(persona4);

        System.out.println(pq); //devuelve ordenado por edad
        System.out.println("--------");

        List<ComparablePersona> list = new ArrayList<>();
        list.add(persona1);
        list.add(persona2);
        list.add(persona3);
        list.add(persona4);
        System.out.println(list); //notar q tambien las devuelve ordenada sin necesidad de usar sort. Al parecer PriorityQueue tiene mejor rendimiento para trabajar con comparables

        Checker checker = new Checker();
       // Collections.sort(ComparablePersona,checker); //Al parecer no sirve con colecciones, solo con arrays
        ComparablePersona [] comparablePersonas = new ComparablePersona[4];
        comparablePersonas[0] = persona1;
        comparablePersonas[1] = persona2;
        comparablePersonas[2] = persona3;
        comparablePersonas[3] = persona4;
        Arrays.sort(comparablePersonas,checker); //Ordenar por orden alfabético
        for (ComparablePersona cp:
             comparablePersonas) {
            System.out.println(cp);
        }
    }
}
