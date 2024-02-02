package ejercicios;

import java.util.Scanner;

public class DivisiblePorCinco {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int n = myscan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i%5==0){
                System.out.println();
            }
        }


    }
}
