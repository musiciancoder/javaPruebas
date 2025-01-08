package ejercicios.barathcurso;

import java.util.Scanner;

public class DigitosPrimos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String number = scanner.nextLine();
            String []  arr = new String[number.length()];
            arr = number.split("");
            boolean b = true;
            for (int a = 0; a < arr.length; a++) {
                Integer digit= Integer.valueOf(arr[a]);
                if( (digit==7) || (digit==5) || (digit==3) || (digit==2)){
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println("All digits are prime");
            } else System.out.println("All digits are NOT prime");

        }
    }
}
