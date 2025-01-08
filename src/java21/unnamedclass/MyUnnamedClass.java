package java21.unnamedclass;

public class MyUnnamedClass {

    /*
    Copilot
Definition:
An unnamed class is a more generalized feature that allows you to define and use a class without explicitly naming it.
It can be seen as an evolution of the anonymous class.

Syntax:

Unnamed classes are defined in place, and can have methods and fields like regular classes.

java
var example = new Object() { //notar q la palabra reservada "new" no cumple va en parentesis y por lo tanto no se usa para pasar un argumento a un metodo.
    void greet() { //notar q si bien el objeto q creamos con new Object hereda de object, no estamos sobreescribiendo ningun metodo de la clase padre  (a diferencia de la clase anonima).
        System.out.println("Hello from unnamed class!");
    }
};
example.greet();

Use Cases:

Useful for scripting, quick testing, and small programs where a full class definition might be overkill.
Allows more flexibility and readability for small tasks and throwaway classes.

Features:

Can define methods and fields.
Provides a cleaner and more readable approach to defining small, one-off classes.
     */
}
