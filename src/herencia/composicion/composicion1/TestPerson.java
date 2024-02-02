package herencia.composicion.composicion1;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println("Person person has a salary of: " + salary);
    }

}