package patronesdiseno.creacionales.factory.mito;

public class App {

    //En este caso no se conoce de antemano el tipo de coneccion ni si se van a agregar mas tipos de conecciones mas adelante en el proyecto.
    //Todoindica a que este sería un ejemplo de Simple Factory Idiom, puesto que en la fabrica estamos dependiendo aun de
    // parámetros como "MYSQL","ORACLE", etc. Aún así este ejemplo es lo mas comun y recomendable en situaciones de codificacion real.
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
