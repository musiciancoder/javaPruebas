package ejercicios;

import java.util.LinkedList;

public class BloqueForDescendente {

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Claudio");
        list.add("Edgardo");
        list.add("Andres");
        list.addFirst("Adarita");
        list.addLast("Elizabeth");
        System.out.println(list);
        LinkedList<String>list2=new LinkedList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2);
    }
}
