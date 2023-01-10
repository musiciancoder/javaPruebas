package clonesyhashcode;

public class ShallowCopy {

    public static void main(String[] args) {
        Employee emp1= new Employee(1,"Andres",45,"ahdg@hotmail.com","1234");
        System.out.println("Emp1: " + emp1.toString() + " ; hashcode: " + emp1.hashCode());

        //Metodo 1: Creando un shallow clone con .clone(). Cuando usamos clone() estamos utilizando el design pattern Prototype
        try {
            Employee emp2 = (Employee) emp1.clone();
            System.out.println("Emp2: " + emp2.toString() + " ; hashcode: " + emp2.hashCode());
            emp2.setName("Claudio");
            System.out.println("Emp1: " + emp1.toString() + " ; hashcode: " + emp1.hashCode()); //notar q a pesar que cambiamos el nombre del segundo empleado, el primero se mantiene inmutabla
            System.out.println("Emp2: " + emp2.toString() + " ; hashcode: " + emp2.hashCode());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



        //Metodo 2: Creando un shallow clone por atributos iguales. Si queremos obtener clones en vez de objetos iguales NO debemos sobrescribir equals y hashcode.
        Employee emp4= new Employee(1,"Andres",45,"ahdg@hotmail.com","1234");
        System.out.println("Emp4: " + emp4.toString() + " ; hashcode: " + emp4.hashCode());

        //Objetos iguales (no son clones porque se igualaron objetos (no es que los atributos se hayan igualado). Tienen mismo hashcode, esto es independientemente si sobrescribo equals y hashcode)
        Employee emp3 = emp1;
        System.out.println("Emp3: " + emp3.toString() + " ; hashcode: " + emp3.hashCode());



    }


}

//Obviamente nunca tan weon como para sobrescribir hashcode o equals!
class Employee implements Cloneable { //Para crear shallow clone debemos implementar Cloneable y sobreescribir el metodo clone haciendolo publico en vez de protected.

    private int id;
    private String name;
    private int age;
    private String email;
    private String password;

    public Employee(int id, String name, int age, String email, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "id: " + this.id +" name:" + this.name + " age: " +this.age + " email: " + this.email + " password: " +this.password;
    }


}
