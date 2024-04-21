package mystreams.interfazfuncional.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        //  PerformOperation performOperation = null;

        while (T > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            Solution solution = new Solution();
            boolean myBoolean;
            if (a == 1) {
              myBoolean =  MyMath.checker(solution.isOdd(), b);
              if (myBoolean==false) {System.out.println("EVEN");}
              else {System.out.println("ODD");}
            }
            if (a == 2) {
                myBoolean = MyMath.checker(solution.isPrime(), b);
                if (myBoolean) System.out.println("PRIME");
                else System.out.println("COMPOSITE");
            }
            if (a == 3) {
                myBoolean = MyMath.checker(solution.isPalindrome(), b);
                if (myBoolean) System.out.println("PALINDROME");
                else System.out.println("NOT PALINDROME");
            }
            T--;
        }

    }
}

class MyMath {
        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
    }


}

public class Solution {



    public PerformOperation isOdd(){
        return n -> n % 2 != 0;
    }

    public PerformOperation isPrime(){
        return n -> {
            boolean flag = true;
            if(n < 2) return false;
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        } ;
    }

    public PerformOperation isPalindrome(){
        return n -> {
            String[] numeros = String.valueOf(n).split("");
            for(int i = 0; i < Math.floor(numeros.length / 2); i++){
                if(!numeros[i].equals(numeros[numeros.length-i-1])){
                    return false;
                }
            }
            return true;
        };
    }
}

    interface PerformOperation {
        boolean check(int a);
    }



