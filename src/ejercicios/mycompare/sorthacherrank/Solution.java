package ejercicios.mycompare.sorthacherrank;

import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }


    /*
    @Override
    public int compareTo(Person o){
        return Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
                .thenComparingInt(Person::getAge)
                .compare(this, o);
    }
    */
    @Override
    public int compareTo(Student s){
        return Comparator.comparing(Student::getCgpa)
                .thenComparing(Student::getFname)
                .thenComparingInt(Student::getId)
                .compare(this, s);
    }

}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int testCases = Integer.parseInt(in.nextLine());
        double cgpa=3.68;

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
             cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.reverse(studentList);

        for(Student st: studentList){
            System.out.println(studentList);
        }


    }
}