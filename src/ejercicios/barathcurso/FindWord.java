package ejercicios.barathcurso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindWord {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            List<String>stringList = new ArrayList<>();
            stringList = Arrays.asList(str.split(" "));
            boolean b = false;
            for (String p:
                 stringList) {
                if (p.equals("gold")){
                    b= true;
                    break;
                }
            }
            System.out.println(b?"Gold was found":"Gold was NOT found");
        }
    }
}
