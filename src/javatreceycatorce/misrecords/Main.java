package javatreceycatorce.misrecords;

public class Main {

    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Kramer",123);
        System.out.println(employeeRecord); //el toString ya viene incorporado en los records
        System.out.println(employeeRecord.name()); //en los recordsno se ocupa employeeRecord.getName() para obtener un atributo
        System.out.println(employeeRecord.hashCode()); //1199952027
        EmployeeRecord employeeRecord2 = new EmployeeRecord("Kramer",123);
        System.out.println(employeeRecord2.hashCode()); //tambien 1199952027, lo que significa que los records son por definicion inmutables, o sea si hay dos objetos con los mismos atributos entonces ambos objetos son el mismo objeto



    }
}
