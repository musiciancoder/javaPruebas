package ejercicios.barathcurso;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            StringBuilder stringBuilder1 = new StringBuilder(str);
            StringBuilder stringBuilder2 = new StringBuilder(str).reverse();
            boolean b = true;
            for (int i = 0; i < str.length(); i++) {
                if (stringBuilder1.charAt(i)!=stringBuilder2.charAt(i)){
                    b= false;
                    break;
                }
            }

            System.out.println(b ? "Palindrome" : "NOT a Palindrome");


        }
    }
}