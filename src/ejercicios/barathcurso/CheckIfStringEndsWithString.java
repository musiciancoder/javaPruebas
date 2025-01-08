package ejercicios.barathcurso;

import java.util.Scanner;

public class CheckIfStringEndsWithString {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            StringBuilder builder1 = new StringBuilder(str1);
            StringBuilder builder2 = new StringBuilder(str2);

            Boolean bool;

            int c=str1.length();
            int d=str2.length();
            while (c-1>str2.length()) {
            if (builder1.charAt(c-1)!=builder2.charAt(d-1)){
                bool = false;
                break;
            }
            c--;
            d--;
            }

           if (bool=true){
               System.out.println("String ends with " + str2);
           } else  System.out.println("String DOED NOT end with " + str2);
            System.out.println("char at 0 of builder1: " + builder1.charAt(0));
           // System.out.println("char at tr1.length() of builder1: " + builder1.charAt(str1.length())); //indexoutofbounds
        }
    }
}
