package ejercicios.barathcurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int number = Integer.parseInt(scanner.nextLine());
            int n1=0;
            int c=0;
            int n2=1;
            int n3;
            List<Integer>integerList= new ArrayList<>();

            do {
                n3=n1+n2;
                integerList.add(n3);
                n1=n2;
                n2=n3;
                c++;
            }while (c<number);

            integerList.forEach(p-> System.out.println(p));


        }
    }
}
