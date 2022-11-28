package clonesyhashcode;

public class GarbageCollector {

    public static void main(String[] args) {
        Person person1 = new Person("Andres",45);
        Person person2 = new Person("Claudio",41);

        System.out.println(person1.toString() + " hashcode: " + person1.hashCode());
        System.out.println(person2.toString() + " hashcode: " + person2.hashCode());

        System.out.println("");
        person1 = person2; //notar que person1 toma los mismos atributos y el mismo hashcode que person2 (sobrescribiendo equals y hashcode da el mismo resultado). Los objetos son iguales (apuntan al mismo objeto con los mismos valores)
        //como el objeto { name:"Andres", age:45 } dejó de ser referenciado, va al colector de basura.
        System.out.println(person1.toString() + " hashcode: " + person1.hashCode());
        System.out.println(person2.toString() + " hashcode: " + person2.hashCode());


    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Name:" + name + "; Age: " + age;
    }


}
