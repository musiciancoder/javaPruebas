package ejercicios.barathcurso;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in);){
        int n = Integer.parseInt(scanner.nextLine());
        if (n%2==0){
            System.out.println("even");
        } else System.out.println("odd");
    }

    }
}
