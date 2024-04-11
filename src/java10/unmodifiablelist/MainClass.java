package java10.unmodifiablelist;

import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {
        List<Integer>list = List.of(10,20,5,7,3);
        List<Integer>newUnmodifiableList = list.stream().filter(s->s%5==0).collect(Collectors.toUnmodifiableList());
        //newList.add(60); //error
        List<Integer>newModifiableList = list.stream().filter(s->s%5==0).collect(Collectors.toList());
        newModifiableList.add(60);
        System.out.println(newModifiableList);

    }
}
