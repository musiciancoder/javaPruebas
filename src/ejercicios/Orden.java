package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Orden {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s,k));

    }

    public static String getSmallestAndLargest(String s, int k){
        String smallest = "";
        String largest = "";


        String str1;
        int quantity = s.length()-k;
        String [] arr = new String[quantity];
        for (int i = 0; i < s.length()-1; i++) {

            str1 = s.substring(i,k);
            arr[i]=str1;
        }

        Arrays.sort(arr);
        smallest = arr[0];
        //largest = arr[arr.lenght];
        return smallest + "\n" + largest;
    }
}
