package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringAList {

    public static void main(String[] args) {
        //a lista
        String str = "hola, soy Andres";
        List<String>list = new ArrayList<>();
        String [] array = str.split(" ");
        list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(list);

        //a string
        str = String.join(" ", list);
        System.out.println(str);

    }

}
