package miembrosdeunaclase;

public class Person {

    private int var1; //instance variable or field variable
    private static int var2; //class variable


    private String name; //property
    private int age; //property
    private static String lastName;
    private static String secondName; //usamos static en una propiedad solamente cuando queremos que esta sea constante. Se escribe SIN final (a diferencia de las constantes normales):

/*
//No compila, el IDE pide borrar lastname
public Person(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        Person.lastName = lastName;
        Person person = new Person("Andres",35);
    }*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        Person.secondName="Hernan";

    }

    public void method1(){
        String str1;//local variable
        String str2= "str2";//local variable
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public static int getVar2() {
        return var2;
    }

    public static void setVar2(int var2) {
        Person.var2 = var2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
