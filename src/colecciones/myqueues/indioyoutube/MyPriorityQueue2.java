package colecciones.myqueues.indioyoutube;

import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    private int rank;
    private String name;

    public Student(String name, int rank) {
        this.rank = rank;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student st) {
        if (rank<st.rank)
            return -1;
        else if (rank > st.rank)
            return 1;
        return 0;
    }
}

public class MyPriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Student>studentQ=new PriorityQueue<>();
        studentQ.add(new Student("Asish",5));
        studentQ.add(new Student("Barun",3));
        studentQ.add(new Student("Manish",1));
        studentQ.add(new Student("Souvik",4));
        studentQ.add(new Student("Rahul",2));
        studentQ.add(new Student("Barun",3)); //sí acepta valores repetidos, pero los tira al final despues de ordenar  !!

        System.out.println("Size of queue: " + studentQ.size());
        System.out.println(studentQ); //[Student{rank=1, name='Manish'}, Student{rank=2, name='Rahul'}, Student{rank=3, name='Barun'}, Student{rank=5, name='Asish'}, Student{rank=4, name='Souvik'}, Student{rank=3, name='Barun'}]


            /*
            Resultado:
            Size of queue: 5
The item of the queue: Student{rank=1, name='Manish'} //q tiene el menor ranking
The item of the queue: Student{rank=2, name='Rahul'}
The item of the queue: Student{rank=3, name='Barun'}
The item of the queue: Student{rank=4, name='Souvik'}
The item of the queue: Student{rank=5, name='Asish'}
             */
        }
    }

