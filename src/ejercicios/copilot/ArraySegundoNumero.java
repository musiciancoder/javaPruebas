package ejercicios.copilot;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ArraySegundoNumero {

/*
Write a program that takes an array of integers as input and returns the second largest element in the array. You must write the solution in Java.

Input:
An integer array, arr, where
3 2 1 4 5
The array length, n, where
3 2 1 4 5

Output:
The second largest element in the array.

Example:
Input:

5
3 2 1 4 5
Output:

4
 */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
          //  arr[i] = Integer.parseInt(scanner.next());
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[3]);
        int largest = arr[0];
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                if (arr[i + 1] > largest) {
                    largest = arr[i + 1];
                }
            }
        }


        List<Integer>ml=new LinkedList<Integer>();
        for (Integer num: arr
             ) {
            ml.add(num);
        }

        ml.remove(Integer.valueOf(largest));

        System.out.println("lista"+ml);

        Integer [] myarr = ml.toArray(new Integer[ml.size()]);
        for (Integer p:
             myarr) {
            System.out.println(p);
        }

        Integer sl = myarr[0];
        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                if (myarr[i + 1] > sl) {
                    sl = myarr[i + 1];
                }
            }
        }
        System.out.println("SL is:" + sl);
    }

}