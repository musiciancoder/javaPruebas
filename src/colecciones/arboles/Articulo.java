package colecciones.arboles;


import java.util.Comparator;

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

    private int numero_articulo;
    private String descripcion;

    public Articulo() { //so we can compare with comparadorArticulos in Arboles1
    }

    public Articulo(int numero_articulo, String descripcion) {
        this.numero_articulo = numero_articulo;
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Articulo o) { //we must to Override method according to our needs
        return numero_articulo - o.getNumero_articulo();
    }

    @Override
    public int compare(Articulo o1, Articulo o2) {

        String descripcionA = o1.getDescripcion();
        String descripcionB = o2.getDescripcion();
        return descripcionA.compareTo(descripcionB); //In alphabetical order on the description
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
