package ejercicios.barathcurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerToBinary {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int number = Integer.parseInt(scanner.nextLine());
            String str = String.valueOf(number);
          //  int numberofdigits=str.length();
            List<Integer>list = new ArrayList<>();
            int b;
            int c=0;
            while (number>=1){
                b= number%2;
                list.add(b);
                number= number/2;
                c++;
            }

            for (int p : list) {
                System.out.print(p);
            }
        }
    }
    }
