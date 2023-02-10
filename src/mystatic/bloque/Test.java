package mystatic.bloque;

public class Test {

    Test() {
        System.out.println("Constructor called");
    }

    static double testVar;

    //los bloques estaticos sirven para inicializar variables estaticas, y se ejecutan antes del constructor
    static {
        testVar = Math.sqrt(9);
        System.out.println(testVar);
    }

}
