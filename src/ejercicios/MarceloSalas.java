/*
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class MarceloSalas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuilder builder = new StringBuilder(word);
        StringBuilder myreverse= builder.reverse();
        String drow = myreverse.toString();
        int l = builder.length();
        String arr[] = new String[l];
        int k=0;
        int c =0;
        //se podria usar tb
       // String arr[] = word.split("");
        if (word.equals(drow)){
            for (int i = 0; i < l ; i++) {
                arr[i] = String.valueOf(builder.charAt(i));
            }

            String arr2 [][]= new  String[l][l];
            arr2 [][] = "0";

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < l ; j++) {

                    if (i==0 || i==l-1){
                        arr2[i][j] = arr[j];


                    }
                    if (j==0 || j==l-1){
                        arr2[i][j] = arr[i];

                    }

                    if(i==j){
                        arr2[i][j]=arr[i];
                    }
                    if (!arr2[i][j].isBlank()) {
                        System.out.print(arr2[i][j]);
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("Word cannot be processed!!");
        }
    }
}
*/
