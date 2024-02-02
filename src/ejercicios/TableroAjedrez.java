package ejercicios;

import java.util.Scanner;

public class TableroAjedrez {



    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        int n = myscan.nextInt();
        String [][] arr = new String[n][n];
        for (int i = 0; i < n; i++) { //i es para abajo, j es para el lado
            System.out.println();
            for (int j = 0; j < n; j++) {
                //Las dos lineas comentadas aca abajo son solo para probar los indices
              //  arr[1][2]= " X "; //a los indices siempre se les suma uno en esta parte
               // System.out.print(arr[i][j]);
                if (i%2==0) {

                    if (j % 2 == 0) {
                        arr[i][j] = " X ";

                    } else {
                        arr[i][j] = " 0 ";
                    }

                    System.out.print(arr[i][j]);
                }
                else {
                    if (j % 2 == 0) {
                        arr[i][j] = " 0 ";

                    } else {
                        arr[i][j] = " x ";
                    }

                    System.out.print(arr[i][j]);
                }



            }

        }

    }

}
