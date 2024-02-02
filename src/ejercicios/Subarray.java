package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr1 = new int[n];
       // int [] arr2 = {0};
        List <Integer> lista = new ArrayList<>();

        int cont =0;

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            arr1[i]= a;
        }

        for (int i = 0; i < n; i++) {
            int suma =0;
            for (int k = i; k < n; k++) {
             suma = arr1[k] + suma;
             if(suma<0){
                 lista.add(suma);
             }
/*             if(arr1[k]+arr1[k]<0){
                 lista.add(arr1[k]+arr1[k]);
             }*/
            }
        }

        int sum = lista.size();
        System.out.println(sum);

    }
}
