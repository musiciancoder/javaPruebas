package ejercicios.copilot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaDeDosNumerosIgualAlTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>list = new ArrayList<>();
        while (scanner.hasNext()){
            list.add(Integer.parseInt(scanner.next()));
        }
        int target = Integer.parseInt(scanner.nextLine());
    }
}
