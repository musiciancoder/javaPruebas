package inmutabilidad;

import java.util.Objects;

public class Person2 { //este ejemplo me lo hice yo para entender que cuando un estadoexterno no es tomado en cuenta en el equals y hashcode, el hashcode no es un buen indicador de inmutabilidad

    private String name;
    private int age;

    public Person2(String name, int age) {
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
    public boolean equals(Object o) {
        if (o instanceof Person2) { //lo escribi yo para hacerlo mas entendible con respecto a lo q entrego copilot
            if (((Person2) o).getName().equals(this.name)) { //solo considerando el nombre, no la edad
                return true;
            } else return false;
        }
        return false;
        //esto entrego copilot
/*        if (this == o) return true; if (o == null || getClass() != o.getClass()) return false;
        Person2 person = (Person2) o;
        return name != null ? name.equals(person.name) : person.name == null;*/
    }

    @Override
    public int hashCode() {
        return 21 * name.hashCode(); //lo escribi yo para hacerlo mas entendible con respecto a lo q entrego copilot
        //return Objects.hash(name, age);  //esto entrego copilot
    }

    public static void main(String[] args) { //Notar q el hashcode no cambio, pero si el estado
        Person2 person2 = new Person2("Alice", 30);
        person2.setAge(16);
        System.out.println("Initial hashCode: " + person2.hashCode() + ", Edad: " + person2.getAge());


        // Perform an update
        person2.setAge(21);
        System.out.println("HashCode after update: " + person2.hashCode() + ", Edad: " + person2.getAge());  //despues del update tiene mismo hashcode pero diferente edad, o sea el hashcode no cambia pero sí el estado externo, demostrandose q hashcode en este caso no es buen indicador de inmutabilidad

    }
}
