package collectionsamigoscode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    //Queue Its an interface
    //Fist in First Out

    public static void main(String[] args) {
        Queue<Personi> supermarket=new LinkedList<>();//linkedlist implementa List y Queue
       // Queue<Personi> supermarket2=new ArrayList<>(); //also possible
        supermarket.add(new Personi("Alex",21));
        supermarket.add(new Personi("Mariam",18));
        supermarket.add(new Personi("Ali",40));

        System.out.println(supermarket.getClass());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());//next in line to be processed
        System.out.println(supermarket.poll());//elimina; retorna nulo si la cola esta vacia
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());



        LinkedList<Personi>linkedList=new LinkedList<>();
        linkedList.add(new Personi("Alex",21));
        linkedList.add(new Personi("Alexis",22));
        linkedList.add(new Personi("Alexis",22));

        System.out.println(linkedList.peek());


        ListIterator<Personi>personiListIterator=linkedList.listIterator();
        while (personiListIterator.hasNext()){
            System.out.println(personiListIterator.next());
        }
        System.out.println("");
        while (personiListIterator.hasPrevious()){
            System.out.println(personiListIterator.previous());
        }

    }



    }

    class Personi{
    private String name;
    private int age;

        public Personi(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "name:" + name + " age: " + age;
        }
    }
