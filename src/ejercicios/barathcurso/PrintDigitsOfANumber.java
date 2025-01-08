package ejercicios.barathcurso;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintDigitsOfANumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {
            String number = scanner.nextLine();
            String [] arr = new String[number.length()];
            arr = number.split("");
            for (String  p:
                 arr) {
                System.out.println(p);
            }
            List<Integer>listEven= new ArrayList<>();
            List<Integer>listOdd= new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                Integer digit = Integer.valueOf(arr[i]);
                if (digit%2==0){
                    listEven.add(digit);
                } else listOdd.add(digit);
            }
            listEven.forEach(p-> System.out.print(p));
            System.out.println("");
            listOdd.forEach(p-> System.out.print(p));



        }
    }
}
