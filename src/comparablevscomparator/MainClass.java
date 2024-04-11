package comparablevscomparator;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        int[] intArr= {5,9,1,10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));



        Employee[] empArr = new Employee[4];
        empArr[0]=new Employee(5, "John");
        empArr[1]=new Employee(9, "Amit");
        empArr[2]=new Employee(1, "Paul");
        empArr[3]=new Employee(1, "Ame");
  /*
        Arrays.sort(empArr); //this is not going to work because JRE does not know which attribute (age or name) we want to compare
        System.out.println(Arrays.toString(empArr)); //Exception in thread "main" java.lang.ClassCastException: class comparablevscomparator.Employee cannot be cast to class java.lang.Comparable (comparablevscomparator.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
*/
        ComparableEmployee[] empArr2 = new ComparableEmployee[4];
        empArr2[0]=new ComparableEmployee(5, "John");
        empArr2[1]=new ComparableEmployee(9, "Amit");
        empArr2[2]=new ComparableEmployee(1, "Paul");
        empArr2[3]=new ComparableEmployee(1, "Ame");

        Arrays.sort(empArr2);
        System.out.println("sorted by age--> " + Arrays.toString(empArr2));

        Arrays.sort(empArr2, ComparableEmployee.NameComparator);
        System.out.println("sorted by name-->" + Arrays.toString(empArr2));

    }
}
