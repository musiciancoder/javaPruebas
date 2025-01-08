package ejercicios.barathcurso;

import java.util.Scanner;

public class RemoveVowelsFromAString {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            str = str.replace("a","");
            str = str.replace("e","");
            str = str.replace("i","");
            str = str.replace("o","");
            str = str.replace("u","");
            System.out.println(str);
        }
    }
}
