package ejercicios.copilot;

import java.util.Scanner;

public class ContarVocalesYConsonantesDeUnString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder(word);
        char c;
        int cons=0;
        int vowel=0;
        for (int i = 0; i < word.length(); i++) {
              c= builder.charAt(i);
              if (c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u') {
                  vowel++;
              } else if(c!=' ')  {
                  cons++;
              }
        }
        System.out.println(vowel + " " + cons);
    }
}
