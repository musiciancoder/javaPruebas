package arraycollectionstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringAListYViceversa {

    public static void main(String[] args) {
        //a lista
        String str = "hola, soy Andres";
        List<String>list;
        String [] array = str.split(" ");
        list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(list);

        //a string
        str = String.join(" ", list);
        System.out.println(str);

        //de string a lista inmodificable
        List<String> list2 = Arrays.asList(str); //con List.of(str) en vez de Arrays.asList(str) es lo mismo
       // list2.add("Claudio"); //no se puede, arroja UnsupportedOperationException !
        System.out.println(list2);

        //de string a lista modificable
        List<String> list3 = new ArrayList<String>(Arrays.asList(str)); //con List.of(str) en vez de Arrays.asList(str) es lo mismo, igual se puede modificar
        list3.add("Claudio"); //Sí se puede
        System.out.println(list3);
    }

}
