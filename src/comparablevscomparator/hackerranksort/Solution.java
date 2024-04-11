package comparablevscomparator.hackerranksort;

/*
You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
Input Format
The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure:

ID Name CGPA
Constraints

The name contains only lowercase English letters. The  contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.

Output Format

After rearranging the students according to the above rules, print the first name of each student on a separate line.

Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
Sample Output

Ashis
Fahim
Samara
Samiha
Rumpa
 */






import java.io.*;
//Mi intento q no funcionó por lo que se explica mas abajo
/*
import java.util.*;

public class Solution {

    */
/*
    5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
     *//*


    public static void main(String[] args) {
        */
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. *//*

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ID;
        String name;
        double C;
        Student[] student = new Student[n]; //en el compilador de hackerrank no corre, porque dice que no se puede instanciar en un metodo estatico (WTF??)
        Checker checker = new Checker();
       for(int i = 0; i < n; i++){
            ID = scan.nextInt();
         //   System.out.println(ID);
            name = scan.next();
        //    System.out.println(name);
            C= scan.nextDouble(); //este es mi codigo, falla acá en esta linea por el nextDouble()
       //     System.out.println(C);

            student[i] = new Student(ID, name, C);
        //    System.out.println(student[i].toString());
        }

        scan.close();
        Arrays.sort(student, checker);
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i].FirstName);
          //  System.out.printf("%s %s\n", student[i].FirstName);
        }
    }
}


class Student{
    int ID;
    String FirstName;
    double CGPA;


    Student(int ID, String FirstName, double CGPA){
        this.ID = ID;
        this.FirstName= FirstName;
        this.CGPA=CGPA;
    }

    @Override
    public String toString() {
        return "name: " + this.FirstName;
    }
}

class Checker implements Comparator<Student>{ //Notice this class (which could also have been anonymous whithin Player class) is created for comparison reasons only

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.CGPA - o2.CGPA != 0){
            return (int) (o1.CGPA - o2.CGPA);
        } else {
            if (!o1.FirstName.equals(o2.FirstName)){
                return o1.FirstName.compareTo(o2.FirstName);
            } else {

                    return o1.ID - o2.ID;

            }
        }
      //  return o1.CGPA - o2.CGPA == 0 ? o1.FirstName.compareTo(o2.FirstName) : o2.score - o1.score; //compare by score and if both scores are equal then compare by name
    }
}
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class Student{
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
}

class Checker implements Comparator<Student>{

    @Override
    public int compare(Student s, Student s2){
        if(s.getCgpa() == s2.getCgpa()){
            if(s.getFname().equals(s2.getFname())){
                return s.getId() - s2.getId() > 0 ? 1: -1;
            }else
                return s.getFname().compareTo(s2.getFname());
        }else
            return s2.getCgpa() - s.getCgpa() > 0 ? 1 : -1;

    }
}

//Este codigo no corre acá pero sí en hackerrank
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>(); //lol notar q aca si esta instanciando en un metodo estatico, por lo q el compilador de hackkerrank esta pal pico
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble(); //ojo, que esto tampoco corre aca ya que al igual q en el codigo mio (comentado mas arriba) da un Exception in thread "main" java.util.InputMismatchException, Sin embargo sí corre en hackerrank

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Checker());
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
