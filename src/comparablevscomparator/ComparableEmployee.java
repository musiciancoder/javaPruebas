package comparablevscomparator;

import java.util.Comparator;

public class ComparableEmployee implements Comparable<ComparableEmployee> {

    private int age;
    private String name;

    public ComparableEmployee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ComparableEmployee o) { //Comparable Interface- comparteTo() is for natural order, comes with java lang
        return this.age - o.age; //Notice we can only sort integers with compareTo, but not Strings
    }

    @Override
    public String toString() {
        return "age: " + this.getAge() + ", name: " + this.getName();
    }

    //What if we want to sort attribute name instead of age? In that case we cannot use compareTo since it returns an int. In that case we need to provide a Comparator, which method "compare" is a customize version of "compareTo"

    //clase anónima interna
    public static Comparator<ComparableEmployee> NameComparator = new Comparator<ComparableEmployee>() {
        @Override
        public int compare(ComparableEmployee o1, ComparableEmployee o2) { //Comparator Interface - compare() is for customize order, comes with java util
            return o1.getName().compareTo(o2.getName());
        }
    }; //semicolon de clase anonima

}



