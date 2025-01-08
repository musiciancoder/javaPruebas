package ejercicios.barathcurso;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String  str =  scanner.nextLine();
      StringBuilder builder = new StringBuilder();

        for (int i =  str.length()-1; i > 0; i--) {
            builder.append(str.charAt(i));
        }
        System.out.println(builder.toString());
    }
}
