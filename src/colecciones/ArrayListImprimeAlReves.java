package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListImprimeAlReves {
    public static void main(String[] args) {


  ArrayList <String> arrayList = new ArrayList<>();


        arrayList.add("fender");
        arrayList.add("aria");
        arrayList.add("gibson");
        System.out.println(arrayList);
        ArrayList <String> arrayList2 = new ArrayList<>(arrayList.size());

 /*    Iterator<String> it = arrayList.iterator(); //notar que en arraylist tambien podemos usar iterador

       while (it.hasNext()){
         //   arrayList2.addFirst(it.next()); //no sirve porq arraylistno tiene el metodo addFirst
    }
    */
 int c=1;
        for (int i = arrayList.size() -1 ; i >= 0; i--) {
            String str = arrayList.get(i);
            arrayList2.set(c,str);
            c++;

        }
        System.out.println(arrayList2);
}
}
