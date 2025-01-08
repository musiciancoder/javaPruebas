package inmutabilidad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class AplicarMetodosAObjetosInmutables {

    public static void main(String[] args) {
        //Para Strings
        String str = "soy string, no soy substring";
        System.out.println("hashcode str original:" + str.hashCode());
        str= str.substring(15); //esto es lo mismo que si crearamos un nuevo string.
        System.out.println(str);


        //Para linkedlist
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("fender");
        arrayList.add("gibson");
        arrayList.add("prs");
        System.out.println(arrayList);
        System.out.println("hascode arraylist antiguo:" + arrayList.hashCode());
        //es lo mismo q si crearamos un arraylist nuevo
        arrayList = (ArrayList<String>) arrayList.stream().map(s->s.replaceAll(s,"la marca se llama ".concat(s))).collect(Collectors.toList()); //recordar q collect(Collectors.toList() devuelve un arraylist, no un linkedlist
        System.out.println(arrayList);



    }

}
