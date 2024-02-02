package ejercicios.mycompare;

import java.util.Comparator;

public class Jugador implements
        Comparable<Jugador>, //sobrescribir CompareTo, sirve para comparar cualquier atributo de la clase y ordenar en base a ellos, ya sea por orden alfabetico en los strings  o por orden creciente en caso de los int
        Comparator<Jugador> //
{

    private String nombre;
    private String apellido;
    private String posicion;
    private int edad;

    public Jugador(String nombre, String apellido, String posicion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.edad=edad;
    }



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Jugador j) {
        return this.edad - j.getEdad() ; //elegimos la edad como parametro de comparacion para compararlos a todos por medio de sort
    }



    @Override
    public int compare(Jugador o1, Jugador o2) {
        String posicion1 = o1.getPosicion(); //elegimos la posicion para comparar un elemento con otro, pero no para compararlos a todos con sort, sino uno a uno.
        String posicion2 = o2.getPosicion();
        return posicion1.compareTo(posicion2);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +" Apellido: " + this.getApellido() + " Posicion: " + this.getPosicion() + " Edad: " + this.getEdad();

    }
}
