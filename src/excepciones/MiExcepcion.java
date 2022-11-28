package excepciones;

public class MiExcepcion extends Exception{
    public MiExcepcion() {
    }

    public MiExcepcion(String message) {
        super("Excepcion en numero cinco!!!");
    }
}
