package ejercicios.copilot;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContarRepeticionesElementosDeUnArray {
    /*
    give me a straight forward hackerrank java oriented kind of challenge so I can practice my programming skills
Sure! Here's a straightforward Java challenge that you might find on a platform like HackerRank:

Problem: Frequency of Elements
Description:
Write a program that takes an array of integers as input and returns the frequency of each element in the array.

Input:
An integer array, arr, where
1≤𝑎𝑟𝑟[𝑖]≤1000.

The array length, n, where
1≤𝑛≤100.

Output:
For each unique element in the array, print the element followed by its frequency.

Example:
Input:
5
1 2 2 3 3

Output:
1: 1
2: 2
3: 2
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], null);
        }

        for (Integer key : map.keySet()) {
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (key == arr[i]) {
                    c++;
                }
            }
            map.put(key, c);
        }
    }
}
