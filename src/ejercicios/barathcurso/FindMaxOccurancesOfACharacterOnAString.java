package ejercicios.barathcurso;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMaxOccurancesOfACharacterOnAString {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            str = str.replace(" ", "");
            str = str.toLowerCase();
            Map <String,Integer> map = new HashMap<>();
            String [] arr = new String[str.length()];
            arr = str.split("");
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i],null);
            }
            int c;
            for (String p:
                 map.keySet()) {
                c =0;
                for (int i = 0; i < arr.length; i++) {
                   if (p.equals(arr[i])){
                       c++;
                       map.put(p,c);
                   }
                }
            }
            for (Map.Entry<String,Integer> p:
                 map.entrySet()) {
                System.out.println(p);
            }
        }
    }
}
