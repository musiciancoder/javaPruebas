package patronesdiseno.conductuales.memento.segungeekforgeeksartista;

public class Fotografia { //Memento

    private String imagen;
    private String resolucion;


    public Fotografia(String imagen, String resolucion) {
        this.imagen= imagen;
        this.resolucion = resolucion;
    }

    public String getimagenYResolucionGuardados() {
        return this.imagen.concat(", ").concat(this.resolucion);
    }
}
