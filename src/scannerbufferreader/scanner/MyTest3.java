package scannerbufferreader.scanner;

import java.util.Scanner;

public class MyTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str2 = scanner.next();
        System.out.println("str: " + str);
        System.out.println("str2: " + str2);
        //hola mundo del profesor rosa --> toma str= hola y str2=mundo, pero nada mas
        //al querer escribir hola mundo del profesor rosa con cada palabra en cada linea solo toma str= hola y str2=mundo, pero nada mas
    }
}
