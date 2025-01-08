package java10.usovar;



import java.util.ArrayList;
import java.util.function.Consumer;

/*
The var keyword, introduced in Java 10, allows for local variable type inference. This means that
the compiler can automatically determine the type of a variable based on the value assigned to it. Here's how you can use the var keyword.
Rules and Limitations:
var can only be used for local variables within methods, for-loops, and try-with-resources statements.
It cannot be used for instance variables, method parameters, or return types.
The type must be inferrable from the context. For example, this won't work:
 */

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

        //En try with resources es muy comun (compilaria si tuvieramos file.txt )
    /*    try (var inputStream = new FileInputStream("file.txt")) {
            // The compiler infers that inputStream is of type FileInputStream
            // Do something with the input stream
        } */


    }

    //No se puede usar para definir expresiones lambdas, pero sí dentro de ellas

    Consumer<Integer>l=(i)->{ //no se puede usar var l para substituir a Consumer<Integer>l
        var z =10;
        System.out.println(i);
    };



}