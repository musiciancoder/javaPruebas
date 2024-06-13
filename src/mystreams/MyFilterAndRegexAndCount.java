package mystreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFilterAndRegexAndCount {

    public static void main(String[] args) {
        //contar las palabras que contengan "sa" solo al comienzo de la palabra y que este seguido de "lva"
      String str = "Mara salvatrucha del Salvador en San Salvador no salva a ningun asalariado";
        List <String> stringList = new ArrayList<>(Arrays.asList(str.split(" ")));
        String regex = ".del|.*[sS]al.*";
                stringList = filterList(stringList,regex);
        System.out.println(stringList);





    }

 private static   List<String> filterList(List<String> list, String regex) {
        return list.stream().filter(s -> s.matches(regex)).collect(Collectors.toList());
    }
}
