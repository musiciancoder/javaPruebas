package ejercicios.copilot;

import java.util.Arrays;
import java.util.Scanner;

public class EncontrarMedianaEnUnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = Integer.parseInt(scanner.next());
       int [] arr = new  int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        double median=0;
        int index;
        if (n%2==0){
          double uno =  arr[(n-1)/2];
          double dos = arr[(n/2)];
            median = (uno + dos)/2;
        }else {
            int c =n-1;
            for (int i = 0; i < n; i++) {
                if(c==i){
                   median = arr[i];
                } else {
                    c--;
                }
            }
        }

        System.out.println(median);
    }
}
