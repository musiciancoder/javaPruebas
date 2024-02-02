package ejercicios;

import java.util.Arrays;
import java.util.Scanner;



public class CuadradoCaracteres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder builder = new StringBuilder(text);
        StringBuilder reverseBuilder = new StringBuilder(text);
        reverseBuilder.reverse();


        int n= builder.length();

        char[][] array = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0){
                    array[i][j]=builder.charAt(j);
                } else if (j==0) {
                    array[i][j]=builder.charAt(i);
                } else if (j==n-1) {
                    array[i][j]=reverseBuilder.charAt(i);
                } else if (i==n-1) {
                    array[i][j]=reverseBuilder.charAt(j);
                } else {
                    array[i][j]=' ';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }

        }

        System.out.println("");
    }
}
