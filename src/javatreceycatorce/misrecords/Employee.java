package javatreceycatorce.misrecords;

/*
Usar Employee record es lo mismo que escribir toda esta clase, por lo que nos ahorramos verbosidad
 */

/*
public class Employee {

    private final String name; //con final en variable de instancia no puede llevar setter
    private final int employeeNumber; //con final en variable de instancia no puede llevar setter

    public Employee(String name, int employeeNumber) { //canonical constructor
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return employeeNumber == employee.employeeNumber && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }
}


 */
