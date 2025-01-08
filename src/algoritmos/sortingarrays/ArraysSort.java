package algoritmos.sortingarrays;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {

        int[] numbers = {25, 35, 15, 10, 5};
        Arrays.sort(numbers);
        for (int p:numbers) {
            System.out.println(p);
        }
    }
}
