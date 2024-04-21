package ejercicios;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        boolean b = primo();
        if(b) System.out.println("el numero es primo");
        else System.out.println("el numero NO es primo");


    }


    static boolean primo (){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int p=2;
        double res;
        boolean b = true; //el numero es primo
        while (p<num){
            res = num%p;
            if (res==0.0) {
                b=false;
                break;
            }
            else p++;
        }
        return b;
    }
}
