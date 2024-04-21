package myregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Sample Input

5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB
Sample Output

Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab
 */

public class HackeRank2 { //Palabras repetidas

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+"; // Regular expression matching repeated words, pero ojo que solo hace match en palabras repetidas consecutivamente (como en "in inthe", pero no en "in the in")
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Compile the regex with case-insensitive flag

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1)); // Replace repeated word with its first occurrence
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }





}
