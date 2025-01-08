package ejercicios.barathcurso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountWordsInAString {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            List<String>stringList = new ArrayList<>();
            stringList = Arrays.asList(str.split(" "));
            System.out.println(stringList.size());
        }
    }
}
