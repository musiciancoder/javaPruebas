package myregex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HackerRank1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int c =0;
        String str;

        while (c<n){
            str = scan.nextLine();
            try {
                Pattern pattern =  Pattern.compile(str);
                System.out.println("Valid");
            } catch (Exception e) {
              //  e.printStackTrace();
                System.out.println("Invalid");
            }
            c++;
        }
    }
}
