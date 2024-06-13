package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollectionsPunto {

    //IMPORTANTE Los metodos q estan aca (excepto .min) son todos void

    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("piano");
        listStrings.add("trompeta");
        listStrings.add("guitarra");
        listStrings.add("bateria");
        listStrings.add("trombon");
        listStrings.add("esternoscopio");

        Collections.reverse(listStrings); //ordena por orden de llegada al reves (ultimo en entrar primero en salir)

        System.out.println(listStrings);



        Collections.sort(listStrings); //ordenadas por orden alfabetico

        System.out.println(listStrings);

        Collections.reverse(listStrings); //ordenadas por orden alfabetico inverso

        System.out.println(listStrings);

        Collections.rotate(listStrings,2); //los dos ultimos los tira al principio

        System.out.println(listStrings);

       String min = Collections.min(listStrings);

        System.out.println(min); //muestra el primero en orden alfabetico (el metodo .max muestra el ultimo )


         Collections.swap(listStrings,1,2); //intercambia el segundo por el tercero

        System.out.println("swap: " + listStrings);


        List<Double> listDouble = new ArrayList<>();
        listDouble.add(1.4);
        listDouble.add(0.5);
        listDouble.add(2.5);
        listDouble.add(1.41);

        Collections.reverse(listDouble); //ordena por orden de llegada al reves (ultimo en entrar primero en salir)

        System.out.println(listDouble);

        Collections.sort(listDouble); //ordenadas por orden creciente

        System.out.println(listDouble);

        Collections.reverse(listDouble); //ordenadas por orden decreciente

        System.out.println(listDouble);

        double max = Collections.max(listDouble);

        System.out.println(max);


    }
}
