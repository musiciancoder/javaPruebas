package unicodechars;

public class SaltoDeLinea {

    public static void main(String[] args) {
        System.out.println("Hola " +
                "'\\u000A' mundo");
        System.out.println("Hola " +
                " mundo");
        System.out.println("--------1-------");
        System.out.println("hola" + "\nmundo");
        System.out.println("--------2-------");
        System.out.println("hola" +
                "\nmundo");
        System.out.println("--------3-------");
        System.out.print("hola" + "\nmundo");
        System.out.print("--------4-------");
        System.out.print("hola" +
                "\nmundo");
    }
}
