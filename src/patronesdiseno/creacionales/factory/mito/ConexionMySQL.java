package patronesdiseno.creacionales.factory.mito;

public class ConexionMySQL implements IConexionBD {

  private String host;
  private String puerto;
  private String usuario;
  private String contrasena;

    public ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }



    @Override
    public void conectar() {
        //Aqui puede ir codigo JDBC
        System.out.println("Se conectó exitosamente a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("NO se conectó a MySQL");

    }
}
