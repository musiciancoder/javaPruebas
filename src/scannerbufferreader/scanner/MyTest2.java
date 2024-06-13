package scannerbufferreader.scanner;

import java.util.Scanner;

public class MyTest2 {
    public static void main(String[] args) {
        System.out.println("Enter an integer, click return and in the next line enter a string");
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt(); //notar q esta linea debe ser agregada si queremos que se salte a la linea siguiente
        scanner.nextLine();
        String str1 = scanner.nextLine();
        System.out.println("Integer: " + int1 + ", String: " + str1);
    }

    //al probar con 4 y dar click en return para escribir lala, ahora no se salta hasta el final del programa
    //al probar con 4 5 lala solo reconoce el 4, no el 5
}
