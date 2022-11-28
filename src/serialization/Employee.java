package serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L; //Esta es la version de la clase (en este caso primera version). Esto es exigido al serializar, ya que si hacemos un cambio importante en la clase (modificar el constructor por ejemplo) nos va a dar error. Para solventar este error devemos cambiar de version, o sea a 2L.
    private int id;
    private String name;
    private int age;
    private String email;
    private transient String password; //Con transient no llamamos al constructor para este campo (no queremos serializarlo), ya q deseamos protegerlo.  notar que al deserializar el password viene en null

    private Address address;



    public Employee(int id, String name, int age, String email, String password, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public Employee(int id, String name, int age, String email, String password) {
        System.out.println("Employee args constructor is called");
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
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
