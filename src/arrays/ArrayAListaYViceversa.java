package arrays;

import java.util.*;

public class ArrayAListaYViceversa {

    public static void main(String[] args) {


        String[] arr = new String[]{"azul", "rojo", "verde", "amarillo"};
        List list = Arrays.asList(arr); //Esto crea una lista inmutable. NO ES ACONSEJABLE!!!!!
        String str;

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            str = String.valueOf(it.next());
            System.out.println("El string es: " + str);
            System.out.println("La lista es: " + list);
            //list.remove(it.next()); //Da error con listas inmutables!!
        }

        String[] arr2 = new String[]{"naranja", "violeta", "blanco"};
        List<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            str = String.valueOf(it2.next());
            System.out.println("El string es: " + str);
            System.out.println("La lista2 es: " + list2);
            if(str.equals("violeta")){
                list2.remove("violeta"); //para poder modificar una lista con el iterador tiene q estar dentro de un if
            }
           // list2.remove(str); //no funciona porque no esta en un if!!
         //   list2.add("rosado");/no funciona porque no esta en un if!!

        }

        List<String>list3 = new LinkedList<>();
        list3.add("cafe");
        list3.add("negro");

        Iterator<String> it3= list3.iterator();

        while (it.hasNext()){
            list3.remove(it3.next());
            System.out.println(list3.size());
        }
    }
}
