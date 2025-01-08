package ejercicios;

import java.util.Scanner;

public class SumaMitadElementosArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        int sum =0;
        if (n%2==0){
            for (int i=(n-1); i>((n-1)/2) ; i--) {
                sum = sum + arr[i];
            }
        } else {
            for (int i=n-1; i>((n-1)/2) ; i--) {
                sum = sum + arr[i];
            }
        }
    }
}
