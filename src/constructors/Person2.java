package constructors;

public class Person2 {

    private static String name;
    private int age;

    public Person2(int age, String name) {
        this.age = age;
        Person2.name = name;
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person2.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age + ", name=" + name +
                '}';
    }
}

class Tester{
    public static void main(String[] args) {
        Person2 person2 = new Person2(45, "Andres");
        System.out.println(person2.toString());
    }
}
