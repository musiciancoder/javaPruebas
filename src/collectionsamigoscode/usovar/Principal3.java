package collectionsamigoscode.usovar;



import java.util.ArrayList;
import java.util.function.Consumer;

public class Principal3 {

    public static void main(String[] args) {

//evita la lata de escribir en el lado izquierdo ArrayList<Persona> en colecciones
        var lista= new ArrayList<Persona>();
        lista.add(new Persona("pedro","perez",20));

        var lista2=new ArrayList<String>();
        lista2.add("a");
        lista2.add("b");
        lista2.add("c");

        for (var l:lista //se puede usar en los loops de colecciones, como en este foreach
             ) {
            System.out.println(l.toString());
        }
        System.out.println(lista2);

    }

    //No se puede usar para definir expresiones lambdas, pero sí dentro de ellas

    Consumer<Integer>l=(i)->{ //no se puede usar var l para substituir a Consumer<Integer>l
        var z =10;
        System.out.println(i);
    };
}