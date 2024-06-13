package scannerbufferreader.scanner;

import java.util.Scanner;

public class MyHasNext {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pregunta si hay mas palabras para el lado o en la siguiente linea
/*        while (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(str);
        }*/

        //pregunta si hay mas palabras en la siguiente linea
/*        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println(str);
        }*/

        //pregunta si hay mas numeros hacia el lado o en la siguiente linea
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);
        }
        scanner.nextLine();
      String str2 =scanner.nextLine();
        System.out.println(str2);

    }

}
