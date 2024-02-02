package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntArrayAListOfInteger {

    public static void main(String[] args) {
        int num = 1492;
        String str = String.valueOf(num);
        List<String> myList = new ArrayList<>(Arrays.asList(str.split("")));
        List<Integer> listOfInteger = myList.stream().map(a -> Integer.parseInt(a)).collect(Collectors.toList());

        int[] arr = listOfInteger.stream().mapToInt(i -> i).toArray();

    }
}