package ejercicios.copilot;

import java.util.*;

public class NumeroDePalabrasEnUnTextoIgualACiertoNumeroConMaps {

    /*
    String text = "The quick brown fox jumps over the lazy dog. The dog was not amused."; int k = 2
     */

    /*
    Write a function that takes a string of text and an integer k, and returns a list of the k most frequent words in the text. The function should be case-insensitive and should ignore punctuation.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
       str = str.replace("!", "");
        str=str.replace("?", "");
      str=  str.replace(".", "");
       str= str.replace(",", "");
        String[] arr = str.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        List<String> list2 = new ArrayList<>();
        String character;

        for (int l = 0; l < list.size(); l++) {
            character = list.get(l);
            list2.add(character.toLowerCase());
        }

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String p:
             list2) {
            map.put(p,null);
        }

        for (String p : map.keySet()) {
            int c=0;
            for (int i = 0; i < arr.length; i++) {
                String st = arr[i];
                if (p.equalsIgnoreCase(st)){
                    c++;
                }
                map2.put(p,c);
            }
        }

        List<String>list3 = new LinkedList<>();

        for ( Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value==n) {
                list3.add(key);
            }
        }

        list3.forEach(p-> System.out.println(p));


    }
}

