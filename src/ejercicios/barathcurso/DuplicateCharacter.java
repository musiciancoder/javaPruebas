package ejercicios.barathcurso;

import java.util.Scanner;

public class DuplicateCharacter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String str1 = scanner.nextLine();
            StringBuilder builder1 = new StringBuilder(str1);
            StringBuilder builder2 = new StringBuilder();
            for (int i = 0; i < str1.length(); i++) {
                if(Character.isLetter(builder1.charAt(i))){
                    builder2.append(builder1.charAt(i));
                    builder2.append(builder1.charAt(i));
                }
            }

            System.out.print(builder2);

        }
        }
}
