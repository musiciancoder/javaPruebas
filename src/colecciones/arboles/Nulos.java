package colecciones.arboles;

import java.util.Comparator;
import java.util.TreeSet;

public class Nulos {


    TreeSet<Producto> arbol  = new TreeSet <>();

    public static void main(String[] args) {

        TreeSet<Producto> arbol  = new TreeSet <>();
        arbol.add(new Producto("verde",30));
        arbol.add(new Producto("rojo",40));
        arbol.add(new Producto(null,null));
        arbol.add(new Producto("amarillo",35));


        System.out.println(arbol);


    }
}

class Producto implements Comparator<Producto>{

    private String color;
    private int precio;

    public Producto(String color, Integer precio) { //int no acepta null escritos expresamente por uno, Integer sí los acepta
        this.color = color;
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "Color: " + color + "; " + "Precio: " + precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.getPrecio();
    }
}
