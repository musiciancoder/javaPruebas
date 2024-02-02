package ejercicios;

import java.util.Scanner;

public class EscribirNumeroDecenasUnidades {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        String cadena = String.valueOf(numero);
        String[] array = cadena.split("");
        int l = array.length;
        String cero;
        String cerosTotales;
        int counter;
        String n;
        for (int i = 0; i < array.length; i++) {
            cero = "";
            cerosTotales="";
            counter = 0;
            while (counter<l-i){
                cero = cero + "0";
                counter ++;
                if (counter==(l-i)-1){
                    cerosTotales =cero;
                  //  cero ="";
                 //   counter=0;

                }
            }

            n = array[i] + cerosTotales;
            System.out.println(n);

        }
    }

}
