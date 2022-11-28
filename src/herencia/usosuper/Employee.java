package herencia.usosuper;

public class Employee extends Person{

    private String position;


    public Employee(int age, String name, String gender, String position) {
        super(age, name, gender);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override //no es necesario escribir explicito el @Override
    public String testMethod(){
        return super.testMethod() + ", but Im also an employee";
    }



    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                '}';
    }
}
