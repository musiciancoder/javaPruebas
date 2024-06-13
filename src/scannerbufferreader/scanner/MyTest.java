package scannerbufferreader.scanner;

import java.util.Scanner;

public class MyTest {

    public static void main(String[] args) {
        System.out.println("Enter an integer, click return and in the next line enter a string");
        Scanner scanner = new Scanner(System.in);
       int int1= scanner.nextInt();
       String str1 = scanner.nextLine();
        System.out.println("Integer: " + int1 + ", String: " + str1);

        //al probar con 4 y dar click en return para escribir lala se salta hasta el final del programa, esto es porque con scanner.nextInt() le decimos que espere algo mas en la misma linea y nosotros no se lo estamos pasando
        //al probar con 4 lala (en la misma linea) lo agarra bien
        //al probar con 44 lala (en la misma linea) tambien lo agarra bien
        //al probar con 4 4 lala (en la misma linea) agarra el primer 4 como integer y luego 4 lala como un string
    }
}
