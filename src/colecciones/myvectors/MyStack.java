package colecciones.myvectors;

import java.util.Stack;

//PRINGLES !!!!
public class MyStack { //Hereda de la clase Vector, por lo q tiene los mismos métodos q esta, y al igual q Vector es thread-safe.
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        stack.add("gato"); //mejor usar push y pop !!!
        stack.add("perro");
        stack.add(null); //acepta
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

        /*
        if stack is LIFO why the last element on the printing is 10 and not 30 if 30 was the last-in ?
       Great observation! The reason the stack prints elements starting with 10 and ending with 30, even though 30 was the last-in, is due
       to the way we are iterating over the stack using a for-each loop in the printStack method.

Explanation:
The Stack class in Java extends Vector, and the for-each loop iterates over the elements in the order they are stored internally in the list. This order is from
the bottom of the stack to the top of the stack.
However, if you want to print elements in the true LIFO order (last-in, first-out), you should pop each element off the stack until it is empty.
         */

        System.out.println("Real LIFO Stack");
        Stack<Integer> stack2 = new Stack<>(); // Push elements onto the stack stack.push(10); stack.push(20); stack.push(30);
        // Push elements onto the stack
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }

    }
}
