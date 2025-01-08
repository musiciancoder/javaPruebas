package ejercicios.barathcurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumOfPositivesAndNegatives {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
          int n= Integer.parseInt(scanner.nextLine());
          int [] arr = new int [n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            List<Integer>listPos=new ArrayList<>();
            List<Integer>listNeg=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i]>=0){
                    listPos.add(arr[i]);
                }else listNeg.add(arr[i]);
            }

            var sumPos = listPos.stream().mapToInt(Integer::intValue).sum();

            System.out.println(sumPos);

        }
    }
}
