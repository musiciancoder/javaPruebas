package ejercicios;

    /*
    ADD 5Write a function solution that, given an integer N, returns the maximum possible value obtained by inserting one '5' digit inside the integer N.
Examples:
1. Given N = 268, the function should return 5268.
2. Given N = 670, the function should return 6750.
3. Given N = 0, the function should return 50.
4. Given N = −999, the function should return −5999.
Assume that:
N is an integer within the range [−8,000..8,000].
     */

import java.util.*;
import java.util.stream.Collectors;

public class Comscore2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> myList = new ArrayList<>(Arrays.asList(str.split("")));
        List<String> listWithFive = new ArrayList<>(); //lista de strings 5268, 2568, etc
        for (int i = 0; i < myList.size()+1; i++) {
             myList.add(i,"5");
            String result = String.join("", myList);
            listWithFive.add(result);
            myList.remove(i);
        }

         List <Integer> intList =   listWithFive.stream().map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(intList);
        System.out.println(intList);
        Collections.reverse(intList);
        System.out.println(intList);

    }
}
