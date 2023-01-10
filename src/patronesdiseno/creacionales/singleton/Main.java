package patronesdiseno.creacionales.singleton;

public class Main {
    public static void main(String[] args) {
        Unico unicoUno= Unico.INSTANCE;
        Unico unicoDos= Unico.INSTANCE;
        if (unicoUno.hashCode()==unicoDos.hashCode()){
            System.out.println("This is a singleton pattern");
        }else {
            System.out.println("This is NOT a singleton pattern");

        }
    }
}
