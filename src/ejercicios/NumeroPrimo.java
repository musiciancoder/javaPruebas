package ejercicios;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int p=2;
        int res;
        while (p<num){
            res = num%p;
            if (res==0){
                System.out.println(num + " no es primo");
                return;
            }
            p++;

        }
        System.out.println(num + " es primo");
    }
}
