package herencia.usosuper;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(40, "Andres","Male", "java developer");
        String str2= emp.testMethod();
        System.out.println(str2);
    }
}
