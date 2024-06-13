package ejercicios;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankTagContent {

/*    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Pattern patternOpen = Pattern.compile("<[a-z][0-9]>|<*>");
            Pattern patternClose = Pattern.compile("<[a-z][0-9]>|<*>");

            for (int i = 0; i < line.length(); i++) {
                String strOpen =
            }

            testCases--;
        }
    }*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        final Pattern pattern = Pattern.compile("<(.+)>([^<>]+)</\\1>"); //  ([^<>]+) --> yo kcho q esto sería el grupo. Ojo!! al probar en 101regex no funciona, pero aqui si funciona.
        while (testCases > 0) {
            String line = in.nextLine();

            Matcher matcher = pattern.matcher(line);

            if (!matcher.find()) {
                System.out.println("None");
            } else {
                System.out.println(matcher.group(2));
                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                }
            }

            testCases--;
        }
    }



}
