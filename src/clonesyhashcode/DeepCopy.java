package clonesyhashcode;

public class DeepCopy {

    public static void main(String[] args) {
        Direccion dir1 = new Direccion(111, "address line 1", "address line 2","Mumbai", 666566656);
        Empleado empleado1 = new Empleado(3,"Jorge",30,"jorge123@gmail.com","123", dir1);
        System.out.println("empleado 1: " + empleado1.toString() + " hashcode: " + empleado1.hashCode());

        try {
            Empleado empleado2 = (Empleado) empleado1.clone();
            System.out.println("Emp2: " + empleado2.toString() + " ; hashcode: " + empleado2.hashCode());
            empleado2.setName("Claudio");
            empleado2.getDireccion().setCity("Delhi");
            System.out.println("Emp1: " + empleado1.toString() + " ; hashcode: " + empleado1.hashCode()); //notar que en deep clone, a diferencia de shallow clone, si es que tenemos alguna propiedad que es una clase que hemos definido nosotros (direccion), si cambio esta propiedad en el clon, cambia tambien el objeto original
            System.out.println("Emp2: " + empleado2.toString() + " ; hashcode: " + empleado2.hashCode());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}




 class Direccion  {

    private int id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private long zipCode;

    public Direccion(int id, String addressLine1, String addressLine2, String city, long zipCode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}



class Empleado implements Cloneable {

    private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private Direccion direccion;



    public Empleado(int id, String name, int age, String email, String password, Direccion direccion) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.direccion = direccion;
    }

    public Empleado(int id, String name, int age, String email, String password) {
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", direccion=" + direccion +
                '}';
    }

    //Si queremos tener un deep clone cuando tenemos atributos que dependen de una clase que hemos definido nosotros mismos, debemos sobrescribir el metodo clone que viene por defecto en el IDE
 /*   @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
*/


    //Si queremos tener un shallow clone cuando tenemos atributos que dependen de una clase que hemos definido nosotros mismos, NO debemos sobrescribir el metodo clone que viene por defecto en el IDE, sino que sobrescribirlo nosotros

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Empleado empleado=(Empleado) super.clone();
        empleado.setDireccion(new Direccion(getDireccion().getId(),getDireccion().getAddressLine1(),getDireccion().getAddressLine2(),getDireccion().getCity(),getDireccion().getZipCode()));
        return empleado;
    }






}


