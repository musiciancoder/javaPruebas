package ejercicios;

import java.util.Scanner;

public class ArrayX {

    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
        int dimension = scan.nextInt();
        String[][] myArr = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++) {

            for (int j = 0; j < dimension; j++) {
                if (i == j) {
                    myArr[i][j] = "x";
                } else if (i==dimension-1-j) {
                    myArr[i][j] = "x";
                } else
                    myArr[i][j] = " ";
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}