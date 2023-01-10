package patronesdiseno.creacionales.factory.mito;

public class ConexionPostgresSQL implements IConexionBD {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionPostgresSQL() {
        this.host = "localhost";
        this.puerto = "3307";
        this.usuario = "user1";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        //Aqui puede ir codigo JDBC
        System.out.println("Se conectó exitosamente a PostgresSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("NO se conectó a PostgresSQL");

    }
}
