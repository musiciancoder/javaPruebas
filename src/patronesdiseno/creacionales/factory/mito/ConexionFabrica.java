package patronesdiseno.creacionales.factory.mito;

public class ConexionFabrica {

    public IConexionBD getConexion (String motorSQL) {
        if (motorSQL==null){
            return new ConecionVacia();
        }
        if (motorSQL.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        } else  if (motorSQL.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        } else         if (motorSQL.equalsIgnoreCase("POSTGRES")){
            return new ConexionPostgresSQL();
        }
        return new ConecionVacia();
    }
}
