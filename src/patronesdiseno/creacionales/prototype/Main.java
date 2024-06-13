package patronesdiseno.creacionales.prototype;



public class Main {

    public static void main(String[] args) {
       Employee emp1= new Employee(1,"Andres",45,"ahdg@hotmail.com","1234");
        System.out.println("Emp1: " + emp1.toString() + " ; hashcode: " + emp1.hashCode());

       //Creamos un shallow clone con .clone(). Cuando usamos clone() estamos utilizando el design pattern Prototype
        try {
            Employee emp2 = (Employee) emp1.clone();
            System.out.println("Emp2: " + emp2.toString() + " ; hashcode: " + emp2.hashCode());
            emp2.setName("Claudio");
            System.out.println("Emp1: " + emp1.toString() + " ; hashcode: " + emp1.hashCode()); //notar q a pesar que cambiamos el nombre del segundo empleado, el primero se mantiene inmutabla
            System.out.println("Emp2: " + emp2.toString() + " ; hashcode: " + emp2.hashCode());
            System.out.println("Emp1: " + emp1 );
            System.out.println("Emp2:" + emp2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
