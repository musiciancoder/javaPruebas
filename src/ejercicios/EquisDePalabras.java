package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EquisDePalabras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len;
        String str;
        do {
            str = scan.nextLine();
            len = str.length();
            if (len % 2 == 0) {
                System.out.println("Enter uneven number!");
            }
        } while (len % 2 == 0);

        StringBuilder builder = new StringBuilder(str);
        StringBuilder reverseBuilder = builder.reverse();

        char[][] arr = new char[len][len];

        for (int i = 0; i < builder.length(); i++) {
            for (int j = 0; j < builder.length(); j++) {
                if (i == j) {
                    arr[i][j] = builder.charAt(i);
                }
            }

        }

        for (int i = reverseBuilder.length() - 1; i >= 0; i--) {
            for (int j = 0; j < builder.length(); j++) {
                if (i == j) {
                    arr[i][j] = reverseBuilder.charAt(i);

                }
            }


        }

        for (int i = 0; i < builder.length(); i++) {
            for (int j = 0; j < builder.length(); j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }

/*        for (int i = 0; i < builder.length(); i++) {
            for (int j = 0; j < builder.length(); j++) {
                if (i == j) {
                    arr[i][j] = builder.charAt(i);
                }
            }

        }*/




        for (int i = reverseBuilder.length() - 1; i >= 0; i--) {
            for (int j = 0; j < builder.length(); j++)  {
                System.out.print(arr[i][j]);

            }
            System.out.println(" ");
        }

        System.out.println(arr.length);

    }



}
