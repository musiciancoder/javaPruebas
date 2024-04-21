package arraycollectionstring;

import java.util.*;

public class ArrayAListaYViceversa {

    public static void main(String[] args) {


        String[] miarray = {"cafe","morado"};
        List<String> lista = new ArrayList<String>(Arrays.asList(miarray)); ////Esto crea una lista mutable.
        lista.add("celeste");
        System.out.println(lista);


        String[] arr = {"azul", "rojo", "verde", "amarillo"};
        List <String>lista2 =Arrays.asList(arr); //Esto crea una lista inmutable. NO ES ACONSEJABLE!!!!!
         //lista2.add("negro"); C
        System.out.println(lista2);

        String[] arr0 ={"blanco", "rojo", "verde", "amarillo"};


        List <String> list0 = new ArrayList<String>();
        list0 = Arrays.asList(arr0);
       // list0.add("negro"); //Esto crea una lista inmutable. NO ES ACONSEJABLE!!!!!
        System.out.println(list0);


        String str;

        Iterator<String> it = lista2.iterator();
        while (it.hasNext()) {
            str = String.valueOf(it.next());
            System.out.println("El string es: " + str);
            System.out.println("La lista es: " + lista2);
            //list.remove(it.next()); //Da error con listas inmutables!!
        }


        String[] array = new String[lista2.size()];
        lista2.toArray(array); // fill the array
        for (String p:
            array ) {
            System.out.println("Array element: " + p);
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

        List<String>list3 = new LinkedList<>(); //linkedlist funciona igual
        list3.add("cafe");
        list3.add("negro");

        Iterator<String> it3= list3.iterator();

        while (it3.hasNext()){
            list3.remove(it3.next());
            System.out.println(list3.size());
        }


        //De lista a array
        String [] myarr = list3.toArray(new String[list3.size()]);
        for (String p:
             myarr) {
            System.out.println(p);
        }
    }





}
