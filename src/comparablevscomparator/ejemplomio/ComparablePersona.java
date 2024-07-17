package comparablevscomparator.ejemplomio;

import java.util.Comparator;

public class ComparablePersona implements Comparable <ComparablePersona>{

    private String nombre;
    private int edad;

    public ComparablePersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(ComparablePersona o) {
       // return this.edad - o.edad; //ordena de menor edad a mayor edad
        return o.edad - this.edad; //ordena de mayor edad a menor edad
    }
}

class Checker implements Comparator<ComparablePersona> {

    @Override
    public int compare(ComparablePersona o1, ComparablePersona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
