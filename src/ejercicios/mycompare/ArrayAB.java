package ejercicios.mycompare;

import java.util.Scanner;

public class ArrayAB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int dimension = scan.nextInt();

        String palabra = scan.nextLine();
        int dimension = palabra.length();
        StringBuilder builder = new StringBuilder(palabra);

        StringBuilder builderReverse = builder.reverse();

                String[][] myArr = new String[dimension][dimension];
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {

             if (i == j) {
               // myArr[i][j] = "A";
                 myArr[i][j] = String.valueOf(palabra.charAt(i));
            } else if (i==dimension-1-j) {
                myArr[i][j] = String.valueOf(builderReverse.charAt(j));;
            } else
                myArr[i][j] = " ";
            System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
            }
    }
}
