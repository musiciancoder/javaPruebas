package modularizacion.paquete2;


// import modularizacion.paquete1.ClaseDefault1; //no se puede acceder desde paquete distinto porque la clase no es publica
// import modularizacion.paquete1.ClaseDefault2;  //no se puede acceder desde paquete distinto porque la clase no es publica
import modularizacion.paquete1.ClasePublica1;

public class Main2 {
    public static void main(String[] args) {
       // String lala= ClaseDefault1.STRCLASEDEFAULT1;
        String lolo = ClasePublica1.STRCLASEPUBLICA1;
      //  String lele= ClaseDefault2.STRCLASEDEFAULT2;
    }
}
