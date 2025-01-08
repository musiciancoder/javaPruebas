package ejercicios.copilot;

/*
Write a function that takes an array of integers and returns a new array containing only the unique elements from the original array. The order
of elements in the resulting array does not matter.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosUnicosDeUnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer [] integers = new Integer[n];
        Integer [] integers2;
        for (int i = 0; i < n; i++) {
            integers[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < integers.length; i++) {
            set.add(integers[i]);
        }

;// Convert Set to array
Integer[] array = set.toArray(new Integer[0]);
        for (Integer i:
             array) {
            System.out.println(i);
        }
    }
}
