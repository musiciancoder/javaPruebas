package arraycollectionstring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListALinkedListYAList {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("fender");
        arrayList.add("gibson");
        arrayList.add("prs");
        System.out.println(arrayList);
        LinkedList<String> linkedList = new LinkedList<>();
        //    linkedList = arrayList; no se puede !!
    //    linkedList = (LinkedList<String>) arrayList; // no se puede hacer esto, porque no es un casting, ya q ambos entan en la misma jerarquia, uno no extiende al otro
        for (int i = 0; i < arrayList.size(); i++) {
            linkedList.add(i, arrayList.get(i));
        }
        linkedList.addLast("jackson");
        System.out.println(linkedList);

        List<String> list = new LinkedList<>();
        list = arrayList;
        list.add("ibanez");
        System.out.println(list);


    }
}
