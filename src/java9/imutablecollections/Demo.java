package java9.imutablecollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        List <String> listPersonas = List.of("Andres","Claudio","Edgardo"); //of() creates unmodifiable imutable collections
        Set<String> setAnimales = Set.of("Adarita","Tommy");
        List <String> listCar = Arrays.asList("Suzuki","Chevrolet"); //looks like this is immutable asweell
  //      listCar.add("Ford");
        System.out.println(listCar);
        String [] array = new String[]{"str0", "str1", "str2"};
        List<String> mutablelist = new ArrayList<String>(Arrays.asList(array)); //this is a mutable modifiable list
        mutablelist.add("str3");
        System.out.println(mutablelist);

     //  listPersonas.add("Ibelys"); //Exception in thread "main" java.lang.UnsupportedOperationException
    //    setAnimales.add("Chica");//Exception in thread "main" java.lang.UnsupportedOperationException

     //   System.out.println(listPersonas);

    }
}
