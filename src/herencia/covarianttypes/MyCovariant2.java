package herencia.covarianttypes;

public class MyCovariant2 {

    public static Object myMethod(){ //No solo al sobreescribir metodos (como en el ejemplo de la clase MyCovariant ) se puede usar covariant types sino en cualquier metodo.
        return "Im a String which extends Object class"; //espera una superclase y retornameos una subclase
    }

    public static void main(String[] args) {
        System.out.println(myMethod());
    }


}


