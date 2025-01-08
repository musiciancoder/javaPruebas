package ejercicios.barathcurso;

import java.util.Scanner;

public class CountDigitsOfANumber {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String  str = scanner.nextLine();
           int n = str.length();
            System.out.println(n);
        }
    }


}