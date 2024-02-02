package ejercicios;

import java.util.Scanner;

public class ImprimeArray {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int n = myscan.nextInt();
        int i=0;
        int [] arr = new int[n];
        int l;
        while (i<n){
            l = myscan.nextInt();
            arr[i] = l;
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }

}
