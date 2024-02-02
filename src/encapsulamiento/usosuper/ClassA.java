package encapsulamiento.usosuper;

public class ClassA {

    private String nombre;
    protected int edad;
    String direccion;
    public int rut;

    public ClassA(String nombre, int edad, String direccion, int rut) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
}
