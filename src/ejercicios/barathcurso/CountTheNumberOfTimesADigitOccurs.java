package ejercicios.barathcurso;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheNumberOfTimesADigitOccurs {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String str = scanner.nextLine();
            String []  arr = new String[str.length()];
            arr = str.split("");
            Map<String,Integer>map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i],null);
            }
            for (Map.Entry<String,Integer>p: map.entrySet()) {
                int c =0;
                String key =  p.getKey();
                for (int i = 0; i < arr.length; i++) {

                    if (key.equals(arr[i])){
                        c++;
                    }
                }
                map.put(key,c);
            }


            for (Map.Entry<String,Integer>p: map.entrySet()) {
                System.out.println(p);
            }

            }
        }
    }

