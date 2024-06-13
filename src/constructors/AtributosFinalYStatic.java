package constructors;

public class AtributosFinalYStatic {
    //An instance variable can never be final and static at the same time, although of course variables that are not instant variables can be static and final in which case they will be constants.
    private final static String name3 = "Mireya"; //una variable final y static siempre va a pedir inicializar en la misma linea.
    private String address3;

    public AtributosFinalYStatic(String address3) {
        this.address3 = address3;
      //  name3 = "Elizabeth"; //no es posible, porque la variablees final
    }
}
