package patronesdiseno.creacionales.factory.mito;

public class App {

    //Todoindica a que este sería un ejemplo de Simple Factory Idiom, puesto que en la fabrica estamos dependiendo aun de parámetros como "MYSQL","ORACLE", etc.
    public static void main(String[] args){
        ConexionFabrica fabrica = new ConexionFabrica();

        IConexionBD cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        IConexionBD cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        IConexionBD cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();



    }
}
