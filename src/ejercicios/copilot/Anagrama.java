package ejercicios.copilot;

import java.util.*;

public class Anagrama {

    /*
    Write a program to check if two given strings are anagrams of each other. Two strings are anagrams if they can be rearranged to form each other. For example, "listen" and "silent" are anagrams.

Input:
Two strings str1 and str2 where

Output:
Return true if the strings are anagrams, otherwise return false.


     */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();


        List<String>firstList  = new ArrayList<>(Arrays.asList(first.split("")));
        List<String>secondList  = new ArrayList<>(Arrays.asList(second.split("")));

        Collections.sort(firstList);
        Collections.sort(secondList);

        int c =0;
        boolean flag =true;
        for (String p: firstList) {
            if (p.equals(secondList.get(c))) {
                c++;
            } else {
                flag = false;
                break;
            }

        }
        System.out.println(flag);

    }

}
