package excepciones;

public class UncheckedException {

    public static void main(String[] args) {
        System.out.println("Primera linea");
        String name=null;

        try {
            printName(name);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        otrometodo();
    }

    private static void otrometodo() {
        System.out.println("Soy otro metodo");
    }

    private static void printName(String name)  { //notar que acá no se nos obliga a escribir throws RuntimeException, con el try catch basta y sobra
        System.out.println(name.length());
    }
}
