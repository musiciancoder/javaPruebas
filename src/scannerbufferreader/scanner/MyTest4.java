package scannerbufferreader.scanner;

import java.util.Scanner;

public class MyTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = Integer.parseInt(scanner.nextLine());
        String str2 = scanner.nextLine();
        System.out.println(str);
        System.out.println(i);
        System.out.println(str2);

        /*
        hola mundo
        45 -->ok
       mundo hola
         */
        /*
        hola mundo
        4 5 -->arroja excepcion, por lo q no se pueden usar espacios con int i = Integer.parseInt(scanner.nextLine());
        mundo hola
         */
    }
}
