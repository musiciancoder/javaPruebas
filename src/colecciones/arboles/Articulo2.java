package colecciones.arboles;

import java.util.Comparator;

public class Articulo2 implements Comparable<Articulo> {

    private int numero_articulo;
    private String descripcion;

    public Articulo2(int numero_articulo, String descripcion) {
        this.numero_articulo = numero_articulo;
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Articulo o) { //we must to Override method according to our needs
        return numero_articulo - o.getNumero_articulo();
    }



    public int getNumero_articulo() {
        return numero_articulo;
    }

    public void setNumero_articulo(int numero_articulo) {
        this.numero_articulo = numero_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "numero_articulo=" + numero_articulo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }


}

class ComparadorArticulos implements Comparator<Articulo2>{



    @Override
    public int compare(Articulo2 o1, Articulo2 o2) {
        String descripcionA = o1.getDescripcion();
        String descripcionB = o2.getDescripcion();
        return descripcionA.compareTo(descripcionB);
    }
}

