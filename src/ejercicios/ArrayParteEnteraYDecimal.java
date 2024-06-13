package ejercicios;
//3
//  3.2
//  6.8
//  5.1  --->  8.3   1.6  2.5

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayParteEnteraYDecimal {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i=0;
        BigDecimal [] arrayInicial = new BigDecimal[n];
        while (i <n ){
            double decimal = Double.parseDouble(scanner.nextLine());
            arrayInicial[i] =new BigDecimal(String.valueOf(decimal));
            i++;
        }
        String [] arrayParteEntera = new  String[n];
        String [] arrayParteDecimal = new  String[n];

        for (int j = 0; j < n; j++) {
            int parteEntera = (arrayInicial[j].intValue());
            arrayParteEntera[j] = String.valueOf(parteEntera);
            BigDecimal dec = new BigDecimal(arrayParteEntera[j]);
            arrayParteDecimal[j] =  String.valueOf(arrayInicial[j].subtract(dec));
        }

        for (int j = 0; j < n; j++) {
            arrayParteDecimal[j] = arrayParteDecimal[j].replace("0.", "");
        }

        String [] arrayFinal = new  String[n];

        for (int j = 0; j < n; j++) {
            if (j+1==n){
                arrayFinal[j] = arrayParteDecimal[0].concat(".").concat(arrayParteEntera[j]);
            } else {
                arrayFinal[j] = arrayParteDecimal[j + 1].concat(".").concat(arrayParteEntera[j]);
            }
        }


        System.out.println(Arrays.toString(arrayFinal));
    }
}
