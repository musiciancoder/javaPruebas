package colecciones.myvectors;

import java.util.Stack;

public class MyStack { //Hereda de la clase Vector, por lo q tiene los mismos métodos q esta, y al igual q Vector es thread-safe
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        stack.add("gato");
        stack.add("perro");
        stack.add("leon");
        stack.add("elefante");
       // stack.remove(); no se puede sin argumentos

        System.out.println("stack: " + stack); //[gato, perro, leon, elefante] , esto contradice al API que dice que es LIFO, sin embargo para Strings se ve q saca primero a gato
        System.out.println("size.peek(): " + stack.peek()); //peek() es un metodo de Stack, pero no de Vector. Peekea a Elefente, o sea q para el peek sí es LIFO
        System.out.println("stack.get(0): " + stack.get(0)); //gato
        stack.pop(); //saca el úlrimo elemento, o sea Elefante
        stack.push("huron"); //lo inserta al final
        System.out.println("stack luego de operaciones exclusivas de clase Stack: " + stack); //gato, perro, leon, huron
        System.out.println("stack.search(); " + stack.search("leon")); //lo mismo q indexOf()


        Stack <Integer> stackIntegers = new Stack<>();
        stackIntegers.add(49);
        stackIntegers.add(7);
        stackIntegers.add(11);
        System.out.println("stackIntegers: " + stackIntegers); //[49, 7, 11] tambien en orden de entrada


    }
}
