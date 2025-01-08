package ejercicios.copilot;

import java.util.*;
import java.util.stream.Collectors;

public class SumaDigitosDeUnNumero {

    /*
    Problem: Sum of Digits of a Number
Description:
Write a program to calculate the sum of the digits of a given integer.

Input:
An integer n where
0≤𝑛≤1000,000


Output:
The sum of the digits of n.
     */

    //Opcion 1
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberString = scanner.next();
      StringBuilder builder = new StringBuilder(numberString);
      int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(builder.charAt(i)));
        }
        System.out.println(sum);
    }*/

    //Opcion2 (con streams)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        List<String>list = new ArrayList<>();
        list = Arrays.asList(number.split(""));
        Optional<Integer> suma =  list.stream().map(e->Integer.parseInt(e)).reduce((integer, integer2) -> integer + integer2);
        if (suma.isPresent()){
            System.out.println(suma.get());
        }
    }
}
