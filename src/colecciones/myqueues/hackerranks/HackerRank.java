package colecciones.myqueues.hackerranks;

import java.util.*;
/*
 * Create the Student and Priorities classes here.

 */

class Student implements Comparable<Student>{

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student other) {
        if (Double.compare(other.cgpa, this.cgpa) != 0) {
            return Double.compare(other.cgpa, this.cgpa); // Higher CGPA comes first
        } else {
            if (!this.name.equals(other.name)) {
                return this.name.compareTo(other.name); // Sort by name alphabetically
            } else {
                return Integer.compare(this.id, other.id); // Sort by ID if names are the same
            }
        }
    }

/*    @Override
    public int compareTo(Student o) {
        return this.id - o.getId();
    }*/


/*    //clase anónima interna
    public static Comparator<Student> NameComparator = new Comparator<Student>() {

        public int compare(Student student1, Student student2) { //Comparator Interface - compare() is for customize order, comes with java util
            if(student1.getCgpa() == student2.getCgpa()){
                if(student1.getName().equals(student2.getName())){
                    return student1.getId() - student2.getId() > 0 ? 1: -1;
                }else
                    return student1.getName().compareTo(student2.getName());
            }else
                return student2.getCgpa() - student1.getCgpa() > 0 ? 1 : -1;
        }
    }; //semicolon de clase anonima*/


/*    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getCgpa() == student2.getCgpa()){
            if(student1.getName().equals(student2.getName())){
                return student1.getId() - student2.getId() > 0 ? 1: -1;
            }else
                return student1.getName().compareTo(student2.getName());
        }else
            return student2.getCgpa() - student1.getCgpa() > 0 ? 1 : -1;

    }*/
}

class Priorities {
    List<Student> getStudents(List<String> events){ //un evento es toda la linea
       // String[] parts;
       // String[] parts=  events.forEach(ev->ev.split(" ").toString());
        List<List<String>>listOfListsOfStrings = new ArrayList<>();



       // String[] parts = new String[events.size()];
        int c=0;
        for (String ev:
             events) {
           listOfListsOfStrings.add(c, (Arrays.stream(ev.split(" ")).toList()));
           c++;
        }

        PriorityQueue<Student>studentQ=new PriorityQueue<>();
        for (List<String>lolos:
            listOfListsOfStrings ) {
            if (lolos.contains("ENTER")){
                int id = Integer.parseInt(lolos.get(3));
                String name = lolos.get(1);
                double cgpa = Double.parseDouble(lolos.get(2));
                Student student = new Student(id,name,cgpa);
                studentQ.add(student);
            }
            if(lolos.contains("SERVED")) {
            studentQ.poll();
            }
        }
        List <Student> ml = new ArrayList<>();
        for (Student st:
             studentQ) {
            System.out.println(st.getName());
            ml.add(st);
        }


        return ml;
    }
}




public class HackerRank {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
