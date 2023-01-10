package patronesdiseno.creacionales.factory.mito;

public class ConexionOracle implements IConexionBD {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionOracle() {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        //Aqui puede ir codigo JDBC
        System.out.println("Se conectó exitosamente a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("NO se conectó a Oracle");

    }
}
