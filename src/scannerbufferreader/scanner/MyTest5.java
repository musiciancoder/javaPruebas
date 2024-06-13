package scannerbufferreader.scanner;

import java.util.Scanner;

public class MyTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
                /*
        hola mundo
        4 5 -->arroja excepcion, por lo q no se pueden usar numeros sin parsearlos en unescaner
        mundo hola
         */

    }
}
