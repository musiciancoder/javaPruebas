package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximoDosNumerosLista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List <Integer> integerList = new ArrayList<>();
        List <Integer> resultListList = new ArrayList<>();
        int q =0;
        while (q++ <n){
        integerList.add(scanner.nextInt());
        }
        integerList.stream()
                .reduce((a, b)->{
            int c = Math.max(a,b);
            resultListList.add(c);
            return c;
        }).stream();
        System.out.println(resultListList);
    }
}
