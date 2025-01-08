package ejercicios.barathcurso;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int number = Integer.parseInt(scanner.nextLine());
            int c =2;
            boolean b= true;
            while (c<number){
                if (number%c==0){
                    b=false;
                    break;
                }
                c++;
            }
            if(b){
                System.out.println("Primal number");
            } else System.out.println("NOT a primal number");
        }
    }

}
