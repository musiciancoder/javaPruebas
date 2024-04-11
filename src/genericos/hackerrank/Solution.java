package genericos.hackerrank;

import genericos.Box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<MyGeneric> list = new ArrayList<>();
        Boolean b = true;
        while (scanner.hasNext()){
            if (scanner.nextLine().getClass().toString().contains("String")){
                b= false;
                MyGeneric<String> stringMyGeneric = new MyGeneric<>(scanner.nextLine());
                list.add(stringMyGeneric);
            }
            if (scanner.nextLine().getClass().toString().contains("Integer")){
                MyGeneric<Integer> integerMyGeneric = new MyGeneric<>(scanner.nextInt());
                list.add(integerMyGeneric);
            }
            if (scanner.nextLine() != null && scanner.nextLine().equalsIgnoreCase("END")) {
                System.out.println("Output list : ");
                break;
            }
        }
        scanner.close();
        MyGeneric[] myGenerics = new MyGeneric[list.size()];
        myGenerics = (MyGeneric[]) list.toArray();
        printArray(myGenerics);
    }

    public static void printArray(MyGeneric[] myGenerics){
        for (MyGeneric p: myGenerics) {
            System.out.println(p);
        }
    }
}
