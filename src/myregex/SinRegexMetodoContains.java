package myregex;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class SinRegexMetodoContains {

    public static void main(String[] args) {
        String str = "hola, soy Andres, hola estoy bien Hola bien";
        String str2="hola";
        if (str.contains(str2)){
            System.out.println("Si contiene " + str2);
            String [] array = str.split(" ");
            Set<String> mySet =  new HashSet<>();
           mySet=  Arrays.stream(array).collect(Collectors.toSet());
           mySet= mySet.stream().map(s->s.toLowerCase().replaceAll("[,.!]","")).collect(Collectors.toSet()); //no soporta forEach porque es una operacion terminal
           str = mySet.toString();
            System.out.println(str);

        }

    }
}
