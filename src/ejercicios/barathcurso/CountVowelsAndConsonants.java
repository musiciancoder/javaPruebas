package ejercicios.barathcurso;

import java.util.*;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            List<String>vowels=new ArrayList<>();
            List<String>consonants=new ArrayList<>();
            char ch;
            for (int i = 0; i < str.length(); i++) {
                if(Character.isLetter(str.charAt(i))){
                    ch = str.charAt(i);
                    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                        vowels.add(String.valueOf(ch));
                    } else {
                        consonants.add(String.valueOf(ch));
                    }
                }
            }

            Map<String,Integer>mapVowels = new HashMap<>();
            Map<String,Integer>mapConsonants = new HashMap<>();

            for (String p:
                 vowels) {
                mapVowels.put(p,null);
            }

            for (String p:
                    consonants) {
                mapConsonants.put(p,null);
            }

            int c;

            for (String p : mapVowels.keySet()) {
                c = 0;
                for (int i = 0; i < vowels.size(); i++) {
                    if (p.equalsIgnoreCase(vowels.get(i))){
                        c++;
                    }
                }
                mapVowels.put(p,c);
            }

            for (String p : mapConsonants.keySet()) {
                c = 0;
                for (int i = 0; i < consonants.size(); i++) {
                    if (p.equalsIgnoreCase(consonants.get(i))){
                        c++;
                    }
                }
                mapConsonants.put(p,c);
            }

            System.out.println("----Vocales----");
            mapVowels.forEach((p,q)-> System.out.println(p+"="+q));
            System.out.println("----Consonantes----");
            mapConsonants.forEach((p,q)-> System.out.println(p+"="+q));
        }
    }
}
