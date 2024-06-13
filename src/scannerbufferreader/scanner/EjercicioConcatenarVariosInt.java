package scannerbufferreader.scanner;

import java.util.Scanner;

public class EjercicioConcatenarVariosInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
       int i=0;
       String strAnterior="";
        while (i++<quantity){
            int n = scanner.nextInt();
            String str = String.valueOf(n);
            strAnterior = strAnterior.concat(str);

        }
        System.out.println(strAnterior);
    }
}
