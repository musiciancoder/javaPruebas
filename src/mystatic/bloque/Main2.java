package mystatic.bloque;

public class Main2 {
    public static void main(String[] args) { //antes de java 1.6 no se requeria de metodo main para ejecutar bloques estáticos, despues de 1.6 sí se requiere
        Test t1 =new Test();
        Test t2 =new Test(); //notar que el bloque estático se ejecuta solo una vez.
        Test t3 =new Test(); //notar que el bloque estático se ejecuta solo una vez.
    }
}
